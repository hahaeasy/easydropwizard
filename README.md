# easydropwizard

  This is **_easy_** demo to show to use dropwizard to create simple Jersey webserver.
  
  
## Steps to create the server

1. mvn archetype:generate -DarchetypeGroupId=io.dropwizard.archetypes -DarchetypeArtifactId=java-simple -DarchetypeVersion=0.8.2
  * When prompt for name, make sure set it to EasyWeb
2. Register JAX-RS (Java API for RESTful Web Services) Resource class in WebApplication (EasyWebApplication) run() method

--------------------------------------------------------------------------------------------------------------------------------  
  
## Build

- mvn install


## Usage

- Run EasyWebApplication and connect to localhost:8080/helloworld/tiger

