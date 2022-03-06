FROM openjdk:8-jre-alpine
WORKDIR /app
COPY /target/kube-podbox-0.0.1.jar /app

EXPOSE 8080
ENTRYPOINT ["sh", "-c"]
CMD ["java -jar /app/kube-podbox-0.0.1.jar"]