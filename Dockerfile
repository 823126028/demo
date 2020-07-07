FROM openjdk:8-jdk-alpine
RUN mkdir -p /docker_home/local
COPY target/demos-1.0-SNAPSHOT.jar /docker_home/local/app.jar
RUN /bin/cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime \
  && echo 'Asia/Shanghai' >/etc/timezone \
ENV JAVA_OPTS=""
CMD [ "sh", "-c", "java $JAVA_OPTS -jar /docker_home/local/app.jar" ]
