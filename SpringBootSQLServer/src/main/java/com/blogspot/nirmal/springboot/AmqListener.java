package com.blogspot.nirmal.springboot;

import com.blogspot.nirmal.springboot.dao.IReceivingMsgDao;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.Component;

import javax.jms.*;
import java.util.Map;

@Component
public class AmqListener {

    @Autowired
    IReceivingMsgDao iReceivingMsgDao;

    @JmsListener(destination = "inbound.queue")
    public void receiveMessage(final Message jsonMessage) throws JMSException {
        String messageData = null;
        System.out.println("Received message " + jsonMessage);
        String response = null;
        if(jsonMessage instanceof TextMessage) {
            TextMessage textMessage = (TextMessage)jsonMessage;
            messageData = textMessage.getText();
            ReceivingMsg msg = new Gson().fromJson(messageData, ReceivingMsg.class);
            System.out.println(msg);
            iReceivingMsgDao.save(msg);
        }
    }
}
