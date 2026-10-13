# Spring Boot Docker Demo

##  Project Overview

This project demonstrates how to containerize a Spring Boot application using Docker. It explains how to build Docker images, run containers, manage containerized applications, and publish Docker images to Docker Hub.

The main goal is to understand how Docker simplifies application deployment by packaging the application and its dependencies into a portable container.

## Technologies Used

- Java
- Spring Boot
- Maven
- Docker
- Docker Hub
- REST API

## Features

- Containerize a Spring Boot application.
- Build a custom Docker image.
- Run the application inside a Docker container.
- Map container ports to host machine ports.
- Manage container lifecycle.
- View container logs and status.
- Publish Docker images to Docker Hub.
- Run applications in isolated environments.
- Reuse Docker images across different environments.

## What Is Docker?

Docker is a platform used to build, package, and run applications inside containers.

Containers provide a consistent environment for applications across development, testing, and deployment.

### Important Docker Concepts

- **Docker Image:** A template used to create containers.
- **Docker Container:** A running instance of a Docker image.
- **Dockerfile:** A file containing instructions to build a Docker image.
- **Docker Hub:** An online registry used to store and share Docker images.
- **Docker Engine:** The software responsible for building and running containers.
- **Port Mapping:** Connects a port on the host machine to a port inside a container.
- **Containerization:** Packaging an application and its runtime dependencies into a container.
- **Volume:** Stores data outside a container's writable layer.
- **Docker Network:** Allows containers to communicate with each other.
- **Docker Compose:** Defines and manages multi-container applications.

##  Project Workflow

1. Develop the Spring Boot application.
2. Build the application using Maven.
3. Create a Dockerfile.
4. Build the Docker image.
5. Run a container from the image.
6. Access the application through the mapped port.
7. Check container status and logs.
8. Tag the image with the Docker Hub repository name.
9. Push the image to Docker Hub.
10. Pull and run the image on another machine.

##  Project Structure


springboot-docker-demo/
├── src/
│   └── main/
│       ├── java/
│       └── resources/
├── pom.xml
├── Dockerfile
├── .dockerignore
└── README.md

*Note: The structure may differ slightly depending on your actual project.*

## Docker Commands

### 1. Check Docker Version
docker --version


### 2. Build the Spring Boot Application
mvn clean package

### 3. Build the Docker Image
docker build -t springboot-docker-demo .

### 4. View Docker Images
docker images

### 5. Run a Container
docker run -d -p 8080:8080 --name springboot-app springboot-docker-demo

-d`: Runs the container in the background.
-p 8080:8080`: Maps host port 8080 to container port 8080.
--name`: Assigns a name to the container.

### 6. Check Running Containers
docker ps

### 7. View All Containers
docker ps -a

### 8. View Container Logs
docker logs springboot-app

### 9. Stop a Container
docker stop springboot-app

### 10. Start a Stopped Container
docker start springboot-app

### 11. Remove a Container
docker rm springboot-app
Stop the container before removing it if it is running.

### 12. Remove a Docker Image
docker rmi springboot-docker-demo
Remove any containers using the image first.

### 13. Tag the Image for Docker Hub
Replace `YOUR_DOCKERHUB_USERNAME` with your Docker Hub username.
docker tag springboot-docker-demo YOUR_DOCKERHUB_USERNAME/springboot-docker-demo:latest

### 14. Push the Image to Docker Hub
docker login
docker push YOUR_DOCKERHUB_USERNAME/springboot-docker-demo:latest

### 15. Pull the Image from Docker Hub
docker pull YOUR_DOCKERHUB_USERNAME/springboot-docker-demo:latest

##  Dockerfile Example

A simple example for a Spring Boot application packaged as a JAR: dockerfile
FROM eclipse-temurin:17-jre
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]

**Note:** This example assumes Java 17 and a JAR compatible with Java 17. Adjust the base image and port to match your application.

## Docker Best Practices

- Use a `.dockerignore` file to exclude unnecessary files.
- Choose an appropriate, supported base image.
- Avoid storing passwords or API keys inside Docker images.
- Use specific image tags for reproducible builds.
- Keep container images as small as practical.
- Store persistent data in volumes when needed.
- Use environment variables for configuration.
- Remove unused containers and images to save disk space.
- Use multi-stage builds when appropriate.

## Learning Outcomes

- Understanding Docker images and containers.
- Creating and managing Dockerfiles.
- Building and running containerized Spring Boot applications.
- Mapping host and container ports.
- Managing container lifecycle and logs.
- Publishing images to Docker Hub.
- Understanding containerization and application portability.
- Learning foundational Docker commands used in development.
