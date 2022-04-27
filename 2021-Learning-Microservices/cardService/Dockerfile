FROM adoptopenjdk/openjdk14:alpine

ADD target/CardService.jar CardService.jar
EXPOSE 8010
ENTRYPOINT ["java", "-jar", "CardService.jar"]