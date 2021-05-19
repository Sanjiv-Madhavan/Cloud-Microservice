FROM adoptopenjdk/openjdk14:alpine

ADD target/ApiGateway.jar ApiGateway.jar
EXPOSE 8012
ENTRYPOINT ["java", "-jar", "ApiGateway.jar"]