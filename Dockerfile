FROM eclipse-termurin:17-jdk-alpine
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT [ "java","-jar","/app.jsr"]
EXPOSE 8080