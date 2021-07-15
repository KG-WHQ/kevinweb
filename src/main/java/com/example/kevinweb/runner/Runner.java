package com.example.kevinweb.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author wuhaoqiang
 * @title: Runner
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/5/26 10:52
 */
@Component
public class Runner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("The Runner start to initialize ...");
    }

}
