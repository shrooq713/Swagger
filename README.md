# Swagger Configuration in Spring Boot Application  

## Introduction 

springdoc-openapi Java library use to automate generation of API documentation for Spring Boot projects.

## Getting Started 

The Following dependency allow spring boot to integrate with swagger-ui:
```
   <dependency>
      <groupId>org.springdoc</groupId>
      <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
      <version>2.3.0</version>
   </dependency>
```
Add swagger-ui path to your prperities file:
```
    # swagger-ui custom path
    springdoc.swagger-ui.path=/swagger-ui.html
```
