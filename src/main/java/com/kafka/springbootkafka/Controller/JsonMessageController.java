package com.kafka.springbootkafka.Controller;


import com.kafka.springbootkafka.Kafka.JsonKafkaProducer;
import com.kafka.springbootkafka.Kafka.KafkaProducer;
import com.kafka.springbootkafka.payload.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api/kafka")
public class JsonMessageController {

    @Autowired
    private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/send")
    public ResponseEntity<String> sendmessage(@RequestBody User user)
    {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json message sent to topic ");
    }
}
