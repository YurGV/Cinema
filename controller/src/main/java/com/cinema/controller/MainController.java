package com.cinema.controller;

import com.cinema.configuration.ContextConfiguration;
import com.cinema.model.Client;
import com.cinema.services.ClientServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainController {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ContextConfiguration.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }

        ClientServiceImpl clientService = applicationContext.getBean("clientService", ClientServiceImpl.class);

      //  Client client = clientService.findByName("name1", "name2");
      //  System.out.println(client);
    }
}
