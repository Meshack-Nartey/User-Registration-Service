package com.narteykwamemeshack.userregistrationservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service // tells Spring to register this class as a bean.
@Primary
public class EmailNotificationService implements NotificationService {
   @Value("${mail.port}")
    private String port;

    @Value("${mail.host}")
    private String host;

    @Override
    public void send(String message, String recipientEmail) {
        System.out.println("Email sent successfully");
        System.out.println("Message : " + message);
        System.out.println("Port : " + port);
        System.out.println("Host : " + host);
    }
}
