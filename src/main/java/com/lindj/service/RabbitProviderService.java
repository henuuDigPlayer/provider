package com.lindj.service;

import com.lindj.config.RabbitConfig;
import com.lindj.model.InvestedTemplateTask;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lindongjie on 18/3/9.
 */

@Service
public class RabbitProviderService {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void sendMessage(String message) {
        this.amqpTemplate.convertAndSend("hello", message);
    }


    public void sendMessage(InvestedTemplateTask investedTemplateTask){
        this.amqpTemplate.convertAndSend("exchange",RabbitConfig.queueName1, investedTemplateTask);
    }

    public void sendMessages(InvestedTemplateTask investedTemplateTask){

        this.amqpTemplate.convertAndSend("exchange", RabbitConfig.queueName2, investedTemplateTask);
    }
}
