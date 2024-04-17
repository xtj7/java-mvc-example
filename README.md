# MVC example with springboot, thymeleaf and mssql

---

__Important__: This is NOT for production code, this is an example for learning, to keep things as easy and accessible as possible. Some best practices have been deliberately ignored, DO NOT deploy this code publicly.

---

## Introduction

This project uses:
- springboot
- thymeleaf
- jdbc / mssql

## Configuration

You can find the configuration for the database in the `application.properties` file. 

```yaml
spring.datasource.url=jdbc:sqlserver://DB_IP:DB_PORT;databaseName=DB_NAME;encrypt=true;trustServerCertificate=true
spring.datasource.username=DB_USER
spring.datasource.password=DB_PASS
```

You need to replace the 5 placeholders DB_IP, DB_PORT, DB_NAME, DB_USER and DB_PASS with values to your database.

For testing purposes I would recommend to set up an MSSQL docker instance: https://hub.docker.com/_/microsoft-mssql-server

## How to run

Once you have the database configured, you can run it via `./gradlew bootRun` (or `gradlew.bat bootRun` under windows). After startup you can access the page in your browser via `http://127.0.0.1:8080`

## Folder structure

You will find the dependencies in the `build.gradle` file. 

The source code will be located in `src/main/java/com/example/springboot` for the models, repositories and controllers.

The templates can be found in `src/main/resources/templates` and are written in HTML/Thymeleaf.

How does this roughly work? The controller receives the request according to the mapping. It then uses the repository to get data to fill the model. The model can then be used in the view (template) to display the data.

## Scope

This example contains an entry page that brings you to a profiles list. You can click each profile and get more details. From there you can edit the profile, but the actual editing functionality still needs to be built by you :-)
I have prepared some code for it already, like the UpdateProfile model and connected it in the ProfileController. 