package com.kafka.springbootkafka.Controller;

import com.kafka.springbootkafka.Kafka.KafkaProducer;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/kafka")
public class MassageController {
    private KafkaProducer kafkaProducer;

    public MassageController(KafkaProducer kafkaProducer) {
        this.kafkaProducer = kafkaProducer;
    }

    // localhost:8080/api/kafka/publish?message=hello kolkata
    @GetMapping("/publish")
public ResponseEntity<String> publish(@RequestParam("message") String message)
    {
        kafkaProducer.sendMessage(message);
        return ResponseEntity.ok("message sent to the topic");
    }

}
