package com.example.kevinweb.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author wuhaoqiang
 * @title: OrderRunner2
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/5/26 10:52
 */
@Component
@Order(2)
public class OrderRunner2 implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The OrderRunner2 start to initialize ...");
    }

}
