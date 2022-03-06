FROM openjdk:8-jre-alpine
WORKDIR /app
COPY /target/@project.build.finalName@.jar /app

EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar /app/@project.build.finalName@.jar"]