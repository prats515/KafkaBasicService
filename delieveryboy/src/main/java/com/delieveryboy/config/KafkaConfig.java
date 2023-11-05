package com.delieveryboy.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    public NewTopic topic(){
        return TopicBuilder.name(AppConstants.LOCATION_TOPIC_NAME)
                //.partitions().replicas()
                .build();

    }
}
