# Use a base image with Java
FROM openjdk:17-jdk-slim AS build

# Set the working directory
WORKDIR /app

# Copy the application jar to the container
COPY AppoinmentManger/target/AppoinmentManger-0.0.1-SNAPSHOT.jar /app/AppoinmentManger-0.0.1-SNAPSHOT.jar

# Expose the port the app will run on
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "AppoinmentManger-0.0.1-SNAPSHOT.jar"]
