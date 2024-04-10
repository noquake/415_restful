# Use the official OpenJDK 20 image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file into the container at /app
COPY build/libs/restful-0.0.1-SNAPSHOT.jar .

# Expose port 8080
EXPOSE 8080

# Command to run the application when the container starts
CMD ["java", "-jar", "restful-0.0.1-SNAPSHOT.jar"]