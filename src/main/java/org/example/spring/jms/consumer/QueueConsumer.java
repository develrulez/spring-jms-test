package org.example.spring.jms.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;


@Component
public class QueueConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(QueueConsumer.class);

    @JmsListener(destination = "testQueue")
    public void receive(Message<String> message){
        LOG.info(message.getPayload());
    }
}
