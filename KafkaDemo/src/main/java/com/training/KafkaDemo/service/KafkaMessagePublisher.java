package com.training.KafkaDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.concurrent.CompletableFuture;

@Service
public class KafkaMessagePublisher {


    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaMessagePublisher(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessageToTopic(String message)
    {

        kafkaTemplate.send("PaymentTopic", message);

        /*CompletableFuture<SendResult<String,Object>> future= kafkaTemplate.send("Demo-Topic",message);
        future.whenComplete((result,ex)->{

            if (ex==null)
            {
                System.out.println("Sent message =[" + message + "] with offset=[" +result.getRecordMetadata().offset() + "]");
            }
            else {
                System.out.println("Unable to Send message = [" +  ex.getMessage() +"]");
            }

        });*/
    }
}
