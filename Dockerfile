FROM openjdk:11
COPY ./target/calc-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java","-jar", "calc-1.0-SNAPSHOT-jar-with-dependencies.jar"]

