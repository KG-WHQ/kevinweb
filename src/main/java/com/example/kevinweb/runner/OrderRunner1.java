package com.example.kevinweb.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author wuhaoqiang
 * @title: OrderRunner1
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/5/26 10:50
 */
@Component
@Order(1)
public class OrderRunner1 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The OrderRunner1 start to initialize ...");
    }

}
