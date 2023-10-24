FROM openjdk:17-jre-slim
ADD target\do-0.0.1-SNAPSHOT.jar seu-app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "seu-app.jar"]

