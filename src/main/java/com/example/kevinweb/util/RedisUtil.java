package com.example.kevinweb.util;


import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @author wuhaoqiang
 * @title: RedisUtil
 * @projectName springbootweb
 * @description: TODO
 * @date 2021/3/23 15:26
 */
public class RedisUtil {
    private static volatile JedisPool jedisPool;

    private RedisUtil() {
    }

    public static JedisPool getJedisPool() {
        if (jedisPool == null) {
            synchronized (RedisUtil.class) {
                if (jedisPool == null) {
                    GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
                    poolConfig.setMaxTotal(100);
                    poolConfig.setMaxIdle(20);
                    jedisPool = new JedisPool(poolConfig, "10.20.3.171", 6379);

                }
            }
        }
        return jedisPool;
    }

    public static Jedis getJedis() {
        return getJedisPool().getResource();
    }

}
