FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} web-api.jar
ENTRYPOINT ["java","-jar","/web-api.jar"]