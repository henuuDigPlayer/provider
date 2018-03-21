package com.lindj.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by lindongjie on 18/3/9.
 */

@Configuration
public class RabbitConfig {

    public static final String queueName1 = "topic.message";

    public static final String queueName2 = "topic.message2";

    @Bean
    public Queue queueName1(){
        return new Queue(queueName1);
    }

    @Bean
    public Queue queueName2(){
        return new Queue(queueName2);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange("exchange");
    }

    @Bean
    public Binding bindingExchangeQueue(Queue queueName1, TopicExchange exchange){
        return BindingBuilder.bind(queueName1).to(exchange).with("topic.message");
    }

    @Bean
    public Binding bingExchangeQueue(Queue queueName2, TopicExchange exchange){
        return BindingBuilder.bind(queueName2).to(exchange).with("topic.#");
    }

}
