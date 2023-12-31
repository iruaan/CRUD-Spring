
# Use an official OpenJDK runtime as a parent image
FROM openjdk:17.0.1-jdk-slim

# Set the working directory to /app
WORKDIR /app

# Copy the application JAR file into the container at /app
COPY target/do-0.0.1-SNAPSHOT.jar /app/do-0.0.1-SNAPSHOT.jar

# Make port 8080 available to the world outside this container
EXPOSE 8080

# Run the JAR file
CMD ["java", "-jar", "do-0.0.1-SNAPSHOT.jar"]