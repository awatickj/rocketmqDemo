package com.df.mq.rocketmqdemo;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @Author kangjun Chen
 * @Date: 2022/12/23  10:08
 * @description 消息消费者
 */
@Component
@RocketMQMessageListener(consumerGroup = "springBootGroup", topic = "TestTopic")
public class SpringBootConsumer implements RocketMQListener {

    @Override
    public void onMessage(Object message) {
        System.out.println("Received message : "+ message);
    }
}

