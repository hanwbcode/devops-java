FROM openjdk:8-jre-alpine
WORKDIR /app
COPY /target/devops-java-1.0.2-SNAPSHOT.jar /app

EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar /app/devops-java-1.0.2-SNAPSHOT.jar"]