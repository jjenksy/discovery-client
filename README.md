# Netflix OSS Eureka Application Service
Spring Boot web app for service discovery.  The application service is a user of the discovery client. It's going to use that client to call out to the Discovery Server and register and deregister itself.


## Getting Started

This project is the service that interfaces with the Netflix OSS Discovery Server it registers itself with the Eureka server so other clients can use it.
### Things that make this project bootiful

What things you need to install the software and how to install them

```
@EnableDiscoveryClient
```
This annotation is where most of the magic happens turns the service app into a client of the Discovery Server

### Installing

Running the project with maven using arguments to set the properties variables

```
mvn spring-boot:run -Drun.arguments="--server.port=8081","--service.instance.name=testJohn"
```
The application.yml magic
```
spring:
  application:
    name: service
eureka:
  client:
    service-url:
      defaultZone: http://localhost:8761/eureka
```
Name of the service and the location of the Eureka server


## Actuator
Access the actuator through postman or curl at:
```
localhost:<port>/mappings
```
To view the metrics navigate to:

```
localhost:<port>/metrics
```
To view the info.
```
localhost:<port>/info
```


## Authors

* **John Jenkins** - (https://github.com/jjenksy)