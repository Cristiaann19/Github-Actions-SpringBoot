
FROM eclipse-temurin:21-jdk
EXPOSE 8080
ADD target/gitactions-new.jar gitactions-new.jar
ENTRYPOINT ["java","-jar", "/gitactions-new.jar"]