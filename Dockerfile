FROM adoptopenjdk:8-jre-hotspot-bionic
#RUN apt update -y && apt install netcat -y
WORKDIR /deploy
COPY target/*.jar application.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "application.jar"]