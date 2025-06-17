FROM openjdk:8-alpine

WORKDIR /app

COPY target/publicze_platform-0.0.1-SNAPSHOT.jar /app/publicze-platform.jar
EXPOSE 8093

ENTRYPOINT ["java", "-jar" , "/app/publicze-platform.jar"]
