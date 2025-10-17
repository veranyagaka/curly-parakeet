FROM eclipse-temurin:17-jdk-jammy

WORKDIR /app

# Copy JAR 
COPY target/stage-zero-0.0.1-SNAPSHOT.jar app.jar

# Expose 
EXPOSE 8080

# Start the jar
ENTRYPOINT ["java", "-jar", "/app/app.jar"]