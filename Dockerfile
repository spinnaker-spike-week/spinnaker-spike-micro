FROM frolvlad/alpine-oraclejdk8:full
VOLUME /tmp
EXPOSE 9090
ADD build/libs/spinnaker-spike-0.1.0.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]