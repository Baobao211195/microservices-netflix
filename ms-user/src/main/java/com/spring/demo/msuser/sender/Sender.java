package com.spring.demo.msuser.sender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.spring.demo.msuser.entity.User;

@Component
public class Sender {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    public void send(String topic, User payload) {
        kafkaTemplate.send(topic, payload);
    }
}
