# Spring Boot GraphQL/Reactive Demo
A Spring Boot reactive web GraphQL demo application.

## Pre-requisites
This application expects a PostgreSQL instance to be running. To start this in docker, run:
```
docker run -d --name postgres --env POSTGRES_PASSWORD=postgres -p 5432:5432 postgres:13.14-bullseye
```
## Running
To start the application, run:
```
mvn spring-boot:run
```