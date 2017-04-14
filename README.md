# RoadBuddy-Web-Application

[![Travis][build-badge]][build]

## Requirements
- OpenJdk 8
- PostgreSQL

## Build
```bash
# First, you need create database 'roadbuddy'
$ psql -U postgres -d postgres -c "CREATE DATABASE roadbuddy WITH OWNER postgres;" -v ON_STOP_ERROR=1

$ mvn clean package
```

## Run application
```bash
# You can run native java
$ java -Xmx200m -jar /opt/roadbuddy/roadbuddy-web-application-0.0.1.jar
# Or just
$ mvn spring-boot:run
```
Application will be available on http://localhost:8080

## Build and Run docker image
```bash
$ docker build -t roadbuddy-web-application:<version> --rm .
# or just run mvn
$ mnv docker:build

$ docker run -p <port>:8080 -it roadbuddy-web-application:<version>
```
Application will be available on http://localhost:<port>

[build-badge]: https://travis-ci.org/RoadBuddy/RoadBuddy-Web-Application.svg?branch=dev
[build]: https://travis-ci.org/RoadBuddy/RoadBuddy-Web-Application
