package com.ilean.jms.activemq.example.simple;
import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-24
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
public class QueueReciever {
    public static void main(String[] args) throws Exception{
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://192.168.224.112:61616");
        Connection connection = connectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
        Destination myqueue1 = session.createQueue("Myqueue1");
        MessageConsumer consumer = session.createConsumer(myqueue1);
        for(int i=0;i<3;i++){
            TextMessage msg = (TextMessage)consumer.receive();
            session.commit();
            System.out.println(msg.getText());
        }
        session.close();
        connection.close();
    }
}
