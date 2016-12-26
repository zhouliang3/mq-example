package com.ilean.jms.activemq.example.spring.listener;

import org.springframework.jms.listener.SessionAwareMessageListener;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-26
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
public class MyTestListener implements SessionAwareMessageListener<Message> {
    @Override
    public void onMessage(Message message, Session session) throws JMSException {
        TextMessage msg = (TextMessage) message;
        System.out.println("recieved msg is:"+msg);
    }
}
