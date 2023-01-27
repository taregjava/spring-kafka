package com.halfacode.springboot.kafka;

import com.halfacode.springboot.payload.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JavaJsonConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JavaJsonConsumer.class);

    @KafkaListener(topics = "halfacodeJsonTopics", groupId = "myGroup")
    public void consume(User user){
        LOGGER.info(String.format("JSON MESSAGE recieved -> %s",user.toString()));
    }
}
