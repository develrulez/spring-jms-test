package org.example.spring.jms.web;

import org.example.spring.jms.sender.QueueSender;
import org.example.spring.jms.sender.VirtualTopicSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class JmsResource {

    @Autowired
    private QueueSender queueSender;

    @Autowired
    private VirtualTopicSender virtualTopicSender;

    @RequestMapping(value = "/jms/queue", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void sendMessageToQueue(@RequestBody String message){
        queueSender.send(message);
    }

    @RequestMapping(value = "/jms/virtualTopic", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void sendMessageToVirtualTopic(@RequestBody String message){
        virtualTopicSender.send(message);
    }
}
