package com.example.kevinweb.datastructure;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author wuhaoqiang
 * @title: GeneralTest
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/9 16:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class GeneralTest {

    @Test
    public void test(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("apple","苹果");
        map.hashCode();

        System.out.println("apple".hashCode());

        //ConcurrentHashMap
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();

        //
        new AtomicInteger();


    }



    /**
     * Transfers all entries from current table to newTable.
     */
    /*void transfer(Entry[] newTable, boolean rehash) {
        int newCapacity = newTable.length;
        for (Entry<K,V> e : table) {
            while(null != e) {
                Entry<K,V> next = e.next;
                if (rehash) {
                    e.hash = null == e.key ? 0 : hash(e.key);
                }
                int i = indexFor(e.hash, newCapacity);
                e.next = newTable[i];
                newTable[i] = e;
                e = next;
            }
        }
    }*/


}
