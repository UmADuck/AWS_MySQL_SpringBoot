FROM openjdk:17
MAINTAINER Dmytro Korol
COPY target/lab5db.jar lab5db.jar

EXPOSE 8800

ENTRYPOINT ["java", "-jar", "lab5db.jar"]