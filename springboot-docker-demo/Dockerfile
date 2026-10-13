
FROM eclipse-temurin:17

LABEL maintainer="Anushagowda@gmail.com"

WORKDIR /app

COPY target/springboot-docker-demo-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
