package com.training.KafkaDemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfiguration {

@Bean
public NewTopic topicCreation()
{
    return TopicBuilder.name("PaymentTopic")
            .partitions(3)
            .replicas(1)
            .build();
}
}
