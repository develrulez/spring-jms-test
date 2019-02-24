package org.example.spring.jms.sender;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class QueueSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(String message){
        jmsTemplate.convertAndSend(new ActiveMQQueue("testQueue"), message);
    }
}
