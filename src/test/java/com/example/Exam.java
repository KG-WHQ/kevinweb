package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

/**
 * @author wuhaoqiang
 * @title: Exam
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/7/13 12:17
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Exam.class)
public class Exam {


    public void stringTest() {
        String s1 = new String(" 程序员 ");
        String s2 = s1.intern();
        String s3 = " 程序员 ";
        String s4 = s3.intern();
        System.out.println(s1 == s2);
        System.out.println(s3 == s2);
        System.out.println(s3 == s4);

        String str1 = "str";
        String str2 = "ing";

        String str3 = "str" + "ing";
        String str4 = str1 + str2;
        String str5 = "string";
        System.out.println(str3 == str4);
        System.out.println(str3 == str5);
        System.out.println(str4 == str5);

    }

    public void method() {
        try {
            System.out.println("try");
            System.exit(0);
            return;
        } catch (Exception ex) {
            System.out.println("异常发生了");
        } finally {
            System.out.println("finally");
        }
        System.out.println("异常处理后续的代码");
    }

    @Test
    public void MapTest() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("a", "2");
        map.put(new String("a"), "3");
        map.put(new String("a"), "4");
        System.out.println(map.size());
        System.out.println(map.get("a"));
        Map<String, String> map1 = new IdentityHashMap<>();
        map1.put("a", "1");
        map1.put("a", "2");
        map1.put(new String("a"), "3");
        map1.put(new String("a"), "4");
        System.out.println("midentityHashMap-->" + map1.size());
        for (Map.Entry<String, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
        Map<String, String> map2 = new LinkedHashMap<>(16, 0.75F, true);
        map2.put("a", "a");
        map2.put("b", "b");
        map2.put("c", "c");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.print("linkedHashMap1-->");
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
        System.out.println();
        map2.put("a", "a1");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            System.out.println("linkHashMap2-->");
            System.out.println(entry.getKey() +":" + entry.getValue());
        }
        /*Iterator<Map.Entry<String, String>> iterator = map2.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey() + "-->" + next.getValue());
        }*/

    }
}


