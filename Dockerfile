FROM java:8
MAINTAINER Morozov Konstantin <morozov.cookie@gmail.com>

RUN mkdir /opt/roadbuddy
ADD ./target/roadbuddy-web-application-0.0.1.jar /opt/roadbuddy/
RUN useradd -d /home/roadbuddy -m roadbuddy
WORKDIR /home/roadbuddy
ENTRYPOINT ["java", "-Xmx200m", "-jar", "/opt/roadbuddy/roadbuddy-web-application-0.0.1.jar", "--spring.profiles.active=prod"]