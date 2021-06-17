FROM adoptopenjdk/openjdk11

WORKDIR /app

EXPOSE 8080

COPY build/libs/customer-service-1.0-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "customer-service-1.0-SNAPSHOT.jar"]