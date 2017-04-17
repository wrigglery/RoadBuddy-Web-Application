FROM java:8
MAINTAINER Morozov Konstantin <morozov.cookie@gmail.com>

# install maven
ENV MAVEN_VERSION 3.2.5

RUN curl -sSL http://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar xzf - -C /usr/share \
  && mv /usr/share/apache-maven-$MAVEN_VERSION /usr/share/maven \
  && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn

ENV MAVEN_HOME /usr/share/maven

RUN mkdir /opt/roadbuddy
ADD ./target/roadbuddy-web-application-0.0.1.jar /opt/roadbuddy/
RUN useradd -d /home/roadbuddy -m roadbuddy
WORKDIR /home/roadbuddy

#ENTRYPOINT ["java", "-Xmx200m", "-jar", "/opt/roadbuddy/roadbuddy-web-application-0.0.1.jar"]
