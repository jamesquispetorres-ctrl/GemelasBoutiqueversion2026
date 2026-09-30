# Etapa 1: Compilación del JAR con Maven y JDK 21
FROM maven:3.9.6-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copiar pom.xml y wrapper
COPY pom.xml ./
COPY .mvn .mvn
COPY mvnw mvnw.cmd ./

# Descargar dependencias
RUN mvn dependency:go-offline -B

# Copiar el código fuente y compilar
COPY src src
RUN mvn clean package -DskipTests

# Etapa 2: Imagen de Ejecución Ligera
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Copiar el JAR generado desde la etapa de compilación
COPY --from=build /app/target/*.jar app.jar

# Exponer el puerto
EXPOSE 8080

# Comando para arrancar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
