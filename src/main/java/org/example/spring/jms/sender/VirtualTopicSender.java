package org.example.spring.jms.sender;

import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class VirtualTopicSender {

    public static final String VIRTUAL_TOPIC_NAME = "VirtualTopic.testTopic";

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message){
        jmsTemplate.convertAndSend(new ActiveMQTopic(VIRTUAL_TOPIC_NAME), message);
    }
}
