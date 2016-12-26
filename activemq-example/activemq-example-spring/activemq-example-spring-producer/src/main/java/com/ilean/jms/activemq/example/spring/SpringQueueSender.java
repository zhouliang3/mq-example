package com.ilean.jms.activemq.example.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-26
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
public class SpringQueueSender {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
        JmsTemplate jmsTemplate = context.getBean("jmsTemplate", JmsTemplate.class);
        jmsTemplate.setDefaultDestinationName("springdest");
        for (int i = 0; i < 10; i++) {
            final int fi = i;
            jmsTemplate.send(new MessageCreator() {
                @Override
                public Message createMessage(Session session) throws JMSException {
                    return session.createTextMessage("Hello ---me1111--"+fi);
                }
            });

        }
    }
}
