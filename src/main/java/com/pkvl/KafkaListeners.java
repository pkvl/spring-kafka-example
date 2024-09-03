package com.pkvl;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "pkvl", groupId = "uniqueGroupId")
    void listener(String data) {
        System.out.println("Listener received data : " + data);
    }
}
