FROM java:8
MAINTAINER Morozov Konstantin <morozov.cookie@gmail.com>

RUN mkdir /opt/roadbuddy
ADD ./target/roadbuddy-1.0.0.jar /opt/roadbuddy/
RUN useradd -d /home/roadbuddy -m roadbuddy
WORKDIR /home/roadbuddy
ENTRYPOINT ["java", "-Xmx200m", "-jar", "/opt/roadbuddy/roadbuddy-1.0.0.jar", "--spring.profiles.active=prod"]