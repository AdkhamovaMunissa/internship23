FROM adoptopenjdk/openjdk11:latest

VOLUME /tmp

RUN mkdir -p /app

WORKDIR /app

COPY . /app

EXPOSE 8090

ENTRYPOINT ["./mvnw", "spring-boot:run"]
