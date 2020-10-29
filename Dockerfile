# Maven build container 

FROM maven:3.5.2-jdk-8-alpine AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/

RUN mvn package

#pull base image

FROM openjdk:8-jdk-alpine

#maintainer 
MAINTAINER mpsmca1984@gmail.com

#expose port 8081
EXPOSE 8081

#default command
CMD java -jar /data/mrt-hibernate-app.jar

#copy mrt-hibernate-app.jar to docker image from builder image

COPY --from=maven_build /tmp/target/mrt-hibernate-app.jar /data/mrt-hibernate-app.jar
