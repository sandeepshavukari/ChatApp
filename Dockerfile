# Use Maven to build the application
FROM maven:3.9.6-eclipse-temurin-17 AS builder

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Grant execute permission to mvnw
RUN chmod +x mvnw

# Package the application
RUN ./mvnw clean package -DskipTests

# Use a smaller JDK base image for running the app
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the jar from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose port (Render uses PORT env variable)
EXPOSE 9090

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]
