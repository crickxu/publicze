FROM openjdk:8-alpine

WORKDIR /app

COPY target/publicze_platform.jar /app/publicze-platform.jar
EXPOSE 8093

ENTRYPOINT ["java", "-jar" , "/app/publicze-platform.jar"]
