package com.example.kevinweb.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuhaoqiang
 * @title: DockerController
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/5/25 16:58
 */
@RestController
public class DockerController {

    @RequestMapping("/docker")
    public String index(){
        return "Hello Docekr";
    }

}
