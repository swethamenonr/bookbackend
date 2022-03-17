# our base build image
FROM maven:3.6.0-jdk-8 as maven

# copy the project files
COPY ./pom.xml ./pom.xml

# build all dependencies testing...

RUN mvn dependency:go-offline -B

# copy your other files
COPY ./src ./src

# build for release
RUN mvn clean
RUN mvn compile
RUN mvn package -DskipTests

# our final base image
FROM openjdk:8-jre-alpine

# set deployment directory
WORKDIR /my-project

#expose port
EXPOSE 8888

# copy over the built artifact from the maven image
COPY --from=maven target/spring-boot-backend-part-0.0.1-SNAPSHOT.jar ./

# set the startup command to run your binary
CMD ["java", "-jar", "./spring-boot-backend-part-0.0.1-SNAPSHOT.jar"]
