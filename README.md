# Proyecto CRUD con Spring Boot y Java 17

Este es un proyecto de demostración para desarrollar una aplicación CRUD utilizando Spring Boot y Java 17.

## Descripción

Este proyecto utiliza Spring Boot 3.2.3 como plataforma para desarrollar una aplicación CRUD básica. Utiliza Spring Boot Starter Data JPA para la capa de persistencia, Spring Boot Starter Web para la capa de presentación y PostgreSQL como base de datos.

## Requisitos

- Java 17
- Maven

## Dependencias

Este proyecto utiliza las siguientes dependencias:

- `org.springframework.boot:spring-boot-starter-data-jpa`
- `org.springframework.boot:spring-boot-starter-web`
- `org.postgresql:postgresql` (con alcance de ejecución `runtime`)
- `org.springframework.boot:spring-boot-starter-test` (con alcance de prueba `test`)

## Ejecución

Para ejecutar la aplicación, puedes utilizar el siguiente comando Maven:

```
mvn spring-boot:run
```

## Construcción

Puedes construir el proyecto utilizando el siguiente comando Maven:

```
mvn clean package
```

Esto generará un archivo JAR ejecutable en el directorio `target/`.
