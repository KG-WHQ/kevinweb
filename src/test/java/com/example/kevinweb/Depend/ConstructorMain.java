package com.example.kevinweb.Depend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author wuhaoqiang
 * @title: ConstructorMain
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/1 15:12
 */

public class ConstructorMain {


    public void test() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        System.out.println(context.getBean(ConstrutorA.class));
        System.out.println(context.getBean(ConstrutorB.class));
    }

}
