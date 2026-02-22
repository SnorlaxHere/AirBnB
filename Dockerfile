# Stage 1: Build the application
FROM eclipse-temurin:17-jdk-alpine AS builder

WORKDIR /app

# Copy the Maven wrapper and source code
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
COPY src/ src/

# Give execute permission to the Maven wrapper
RUN chmod +x mvnw

# Build the application inside the Docker container
RUN ./mvnw clean package -DskipTests

# Stage 2: Create the minimal runtime image
FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

# Copy the built JAR file from the builder stage
COPY --from=builder /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
