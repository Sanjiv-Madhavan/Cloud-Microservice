FROM adoptopenjdk/openjdk14:alpine

ADD target/ServiceRegistry.jar ServiceRegistry.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "ServiceRegistry.jar"]