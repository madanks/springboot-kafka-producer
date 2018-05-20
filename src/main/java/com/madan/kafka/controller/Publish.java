package com.madan.kafka.controller;

import com.madan.kafka.dto.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("kafka")
public class Publish {

    @Autowired
    private KafkaTemplate<String, Message> kafkaTemplate;
    private static final String TOPIC="kafka-topic-madan";

    @GetMapping("/publish/{message}")
    public String publishMessage(@PathVariable("message") final String message){
        kafkaTemplate.send(TOPIC, new Message("Kafka Title",message,new Date()));
        return "Published Successfully";
    }
}
