package com.itheima.receive;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class receiveMQ {

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "demoqueue",durable = "true"),//队列
            exchange = @Exchange(value = "demoexchage",type = ExchangeTypes.TOPIC),//交换机
            key = {"test.#"}
    ))
    public void getMsg(String msg){
        System.out.println(msg);
    }
}
