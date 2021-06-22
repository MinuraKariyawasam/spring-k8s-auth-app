FROM maven:3.6.3-jdk-11-slim AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/

RUN mvn clean install

FROM openjdk:11-slim

#FROM openjdk:8-alpine FOR JAVA 8

WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/spring-auth.jar /app/spring-auth.jar
ENTRYPOINT ["java", "-jar", "/app/spring-auth.jar"]