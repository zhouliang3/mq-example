package com.ilean.jms.activemq.example.spring.listener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能说明:
 *
 * @author zhouliang
 * @Date 2016-12-26
 * <p/>
 * <p/>
 * 版本号 | 作者 | 修改时间 | 修改内容
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
    }
}
