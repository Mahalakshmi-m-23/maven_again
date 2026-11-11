# Stage 1: Build the application with Maven
FROM maven:3.9.6-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the final lightweight runtime image
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar

# Optional: if you have a main class, you can specify an entrypoint. 
# Since triangle is a utility class, this packages it as a library jar.
ENTRYPOINT ["java", "-jar", "app.jar"]