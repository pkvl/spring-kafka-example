1. Start Kafka Zookeeper

```bin/zookeeper-server-start.sh config/zookeeper.properties```

2. Start Kafka Server

```bin/kafka-server-start.sh config/server.properties```

3. Start Kafka Listener (optional) (make sure the topic matches the one provided in the application)

```bin/kafka-console-consumer.sh --topic pkvl --from-beginning --bootstrap-server localhost:9092```

4. You can send simple messages to Kafka, for example

```
POST http://localhost:8080/api/v1/messages
Content-Type: application/json

{
"message": "message via API with Kafka"
}
```