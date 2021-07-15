package com.example.kevinweb.general;

import com.example.kevinweb.util.RedisUtil;
import com.google.common.util.concurrent.RateLimiter;
import lombok.SneakyThrows;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import redis.clients.jedis.Jedis;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author wuhaoqiang
 * @title: Interface
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/25 10:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Interface {


    @Test
    public void test03(){
        RateLimiter rateLimiter = RateLimiter.create(100);
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {
                    System.out.println(rateLimiter.getRate());
                    boolean b = rateLimiter.tryAcquire(10, TimeUnit.MICROSECONDS);
                    if (b == true) {
                        System.out.println("处理业务逻辑。");
                    }else{
                        System.out.println("限流");
                    }

                }
            }).start();
        }




    }

    @Test
    public void test02(){
        AtomicLong atomicLong = new AtomicLong(0);
        int k = 0;

        for (int i = 0; i < 100; i++) {
            new Runnable() {
                @Override
                public void run() {
                    long l = atomicLong.incrementAndGet();
                    //System.out.println(l);
                }
            }.run();

        }

        for (int i = 0; i < 100; i++) {

                    int i1 = k++;
                    System.out.println("-----------i1------" + i1);

        }



    }

    public void test01(){
       //请求开始

            Runnable runnable1 = new Runnable() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i < 15; i++) {
                            Jedis jedis = RedisUtil.getJedis();
                            int total = Integer.parseInt(jedis.get("total"));
                            System.out.println("-----total:" + total);
                            int s = Integer.parseInt(jedis.get("648"));
                            System.out.println("-----s:" + s);
                            if (s <= total) {
                                jedis.set("648", String.valueOf(s + 1));
                                System.out.println("请求成功:" + jedis.get("648"));
                                Thread.sleep(1000);
                            } else {
                                System.out.println("请稍后重试！");
                            }
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };




        //请求处理完成

            Runnable runnable2 = new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < 100; i++) {
                        Jedis jedis = RedisUtil.getJedis();
                        int total = Integer.parseInt(jedis.get("total"));
                        System.out.println("-----total:" + total);
                        int s = Integer.parseInt(jedis.get("648"));
                        System.out.println("-----s:" + s);
                        if (s > 0) {
                            jedis.set("648", String.valueOf(s - 1));
                            System.out.println("处理完成:" + jedis.get("648"));
                        } else {
                            System.out.println("其他！");
                        }
                    }
                }
            };
        runnable2.run();
        runnable1.run();





    }


}
