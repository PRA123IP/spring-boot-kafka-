package com.kafka.springbootkafka.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic javaTopic()
    {
        return TopicBuilder.name("test-topic")
                .build();
    }

    @Bean
    public NewTopic javaTopic1()
    {
        return TopicBuilder.name("test-topic_json")
                .build();
    }
}
