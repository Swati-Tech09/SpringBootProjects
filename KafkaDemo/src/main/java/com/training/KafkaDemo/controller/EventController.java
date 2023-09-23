package com.training.KafkaDemo.controller;

import com.training.KafkaDemo.service.KafkaMessagePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EventController {


    @Autowired
    KafkaMessagePublisher kafkaMessagePublisher;

    @GetMapping("publish/{message}")
    public ResponseEntity<?> sendMessage(@PathVariable String message)
    {
        try {
            kafkaMessagePublisher.sendMessageToTopic(message);
            return ResponseEntity.ok("Message published successfully");
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("publish")
    public ResponseEntity<?> sendMessage1(@RequestParam("message") String message)
    {
        try {
            kafkaMessagePublisher.sendMessageToTopic(message);
            return ResponseEntity.ok("Message published successfully");
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("publish")
    public ResponseEntity<?> sendMessage2 (@RequestBody String message)
    {
        try {
            kafkaMessagePublisher.sendMessageToTopic(message);
            return ResponseEntity.ok("Message published successfully");
        }
        catch (Exception e)
        {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
