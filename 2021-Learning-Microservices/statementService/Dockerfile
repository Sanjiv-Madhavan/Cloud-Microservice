FROM adoptopenjdk/openjdk14:alpine

ADD target/StatementService.jar StatementService.jar
EXPOSE 8011
ENTRYPOINT ["java", "-jar", "StatementService.jar"]