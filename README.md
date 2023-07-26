# PhoneBookRestapi


## Development

Update your local database connection in `application.properties` or create your own `application-local.properties` file to override
settings for development.

After starting the application it is accessible under `localhost:9090`.

## Build

The application can be built using the following command:

```
mvnw clean package
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as
environment variable when running the container.

```
mvnw spring-boot:build-image -Dspring-boot.build-image.imageName=com.uttara/phone-book-restapi
```
