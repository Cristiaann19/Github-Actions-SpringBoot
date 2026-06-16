FROM eclipse-teremurin:21-jdk-alpine
EXPOSE 8080
ADD target/gitactions-new.jar gitactions-new.jar
ENTRYPOINT ["java","-jar", "/gitactions-new.jar"]