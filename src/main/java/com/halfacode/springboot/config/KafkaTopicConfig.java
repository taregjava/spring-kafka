package com.halfacode.springboot.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean
    public NewTopic javaHalfacodeTopics(){
        return TopicBuilder.name("halfacode")
                .build();
    }
    @Bean
    public NewTopic halfacodeJsonTopics(){
        return TopicBuilder.name("halfacode-json")
                .build();
    }
}



