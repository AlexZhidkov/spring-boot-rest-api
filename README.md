# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/2.5.4/reference/htmlsingle/#using-boot-devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

### Testing locally

POST http://localhost:8080/postcodenames
```
[
    {"postCode": 1, "name": "One"},
    {"postCode": 2, "name": "Two"},
    {"postCode": 3, "name": "Three"},
    {"postCode": 4, "name": "Four"},
    {"postCode": 5, "name": "Five"}
]
```

GET http://localhost:8080/postcodenames?from=2&to=4

### Deployment
Deployed to Azure App Service

https://az-java-rest-api.azurewebsites.net/postcodenames