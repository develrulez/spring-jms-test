# Spring JMS example

## How to run

Docker Compose for ActiveMQ

    docker-compose -f src/main/resources/docker-compose.yml up
    
Spring Boot application class

    org.example.spring.jms.JmsTestApplication
    
## How to test

Queue message send

    curl --request POST \
      --url http://localhost:8080/jms/queue \
      --data "Am I not a pretty message?"
