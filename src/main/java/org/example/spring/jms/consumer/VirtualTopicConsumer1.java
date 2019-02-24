package org.example.spring.jms.consumer;

import org.example.spring.jms.sender.VirtualTopicSender;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

@Component
public class VirtualTopicConsumer1 {

    private static final Logger LOG = LoggerFactory.getLogger(VirtualTopicConsumer1.class);

    @JmsListener(destination = "Consumer.VirtualTopicConsumer1." + VirtualTopicSender.VIRTUAL_TOPIC_NAME)
    public void receive(Message<String> message){
        LOG.info(message.getPayload());
    }
}
