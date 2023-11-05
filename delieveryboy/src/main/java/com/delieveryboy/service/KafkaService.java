package com.delieveryboy.service;

import com.delieveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    private Logger logger= LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location){
        for (int s=1;s<=10000000; s++){
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
            this.logger.info("Location Produced!"+s);
            System.out.println("----------------------");
        }
        return true;
    }
}
