FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD /target/mrt-hibernate-app-0.0.1-SNAPSHOT.jar mrt-hibernate-app.jar
ENTRYPOINT ["java","-jar","/mrt-hibernate-app.jar"]