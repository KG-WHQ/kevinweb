package com.example.kevinweb.Depend;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wuhaoqiang
 * @title: ConstrutorB
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/1 15:07
 */
public class ConstrutorB {

    private ConstrutorA construtorA;

    @Autowired
    public ConstrutorB(ConstrutorA construtorA) {
        this.construtorA = construtorA;
    }


}
