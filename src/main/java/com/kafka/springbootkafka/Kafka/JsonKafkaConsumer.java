package com.kafka.springbootkafka.Kafka;

import com.kafka.springbootkafka.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonKafkaConsumer {
    private static final Logger LOGGER= LoggerFactory.getLogger(JsonKafkaConsumer.class);
    @KafkaListener(topics = "test-topic-json",groupId = "my-consumer-group")
    public void cousumer(User user)
    {
        LOGGER.info(String.format("Message Received --> %s",user.toString()));

    }

}
