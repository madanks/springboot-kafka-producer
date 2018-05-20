
 Spring Boot with Kafka Producer Example

    This Project covers how to use Spring Boot with Spring Kafka 
    to Publish JSON/String message to a Kafka topic

Start Zookeeper
    
    This Kafka installation comes with an inbuilt zookeeper. 
    Zookeeper is mainly used to track status of nodes present in Kafka 
    cluster and also to keep track of Kafka topics, messages, etc.
    
    .\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka Server

    .\bin\windows\kafka-server-start.bat .\config\server.properties

Create Kafka Topic

    .\bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic kafka-topic-madan
    
Send Messsage to Kafka Topic via Console

    C:\kafka_2.12-0.10.2.1>.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic kafka-topic-madan Hello World
    
Consume from the Kafka Topic via Console

    .\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic kafka-topic-madan --from-beginning
    
 