FROM java:8
MAINTAINER Morozov Konstantin <morozov.cookie@gmail.com>

RUN mkdir /opt/roadbuddy                                                      # создаем папку для приложения
ADD ./target/roadbuddy-1.0.0.jar /opt/roadbuddy/
RUN useradd -d /home/roadbuddy -m roadbuddy                                   # создаем пользователя
WORKDIR /home/roadbuddy                                                       # запускаемся из хомяка пользователя
ENTRYPOINT ["java", "-Xmx200m", "-jar", "/opt/roadbuddy/roadbuddy-1.0.0.jar"]
EXPOSE 27001