FROM openjdk:8-jdk-alpine

COPY target/car-details-service-1.0.0.jar app.jar

ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
