package com.example.kevinweb.Depend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author wuhaoqiang
 * @title: ConstrutorA
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/1 15:06
 */
@Component
public class ConstrutorA {

    private ConstrutorB construtorB;

    /*@Autowired
    public ConstrutorA(ConstrutorB construtorB) {
        this.construtorB = construtorB;
    }*/
}
