FROM adoptopenjdk/openjdk11:alpine-jre
MAINTAINER imousmoutis
WORKDIR /opt/app
ARG JAR_FILE=target/spring-boot-ssh-shell.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","app.jar"]