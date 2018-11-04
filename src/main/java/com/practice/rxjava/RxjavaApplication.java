package com.practice.rxjava;

import com.practice.rxjava.subscriber.ResourceSubscriber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RxjavaApplication {


    public static void main(String[] args) {

        ResourceSubscriber resourceSubscriber = new ResourceSubscriber();

        resourceSubscriber.getResource();
        System.out.println("####################################\n");
        resourceSubscriber.getResourceName();
        System.out.println("####################################\n");
        resourceSubscriber.getFilteredData();
        System.out.println("####################################\n");
        resourceSubscriber.getGroupWiseData();
        SpringApplication.run(RxjavaApplication.class, args);
    }
}
