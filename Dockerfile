FROM openjdk:8u171-alpine3.7
RUN apk --no-cache add curl
COPY target/point-b-ms*.jar point-b-ms.jar
CMD java ${JAVA_OPTS} -jar point-b-ms.jar