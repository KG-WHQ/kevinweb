package com.example.kevinweb.ClassLoader;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author wuhaoqiang
 * @title: DifferentClassLoaderTest
 * @projectName kevinweb
 * @description: TODO
 * @date 2021/6/7 16:06
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DifferentClassLoaderTest {

    @Test
    public void classLoaderTest() throws Exception{
        ClassLoader classLoader = new ClassLoader() {
            @Override
            public Class<?> loadClass(String name) throws ClassNotFoundException {
                String fileName = name.substring(name.lastIndexOf(".") + 1) + ".class";
                InputStream stream = getClass().getResourceAsStream(fileName);
                if(stream == null){
                    return super.loadClass(name);
                }

                try {
                    byte[] b = new byte[stream.available()];
                    stream.read(b);
                    return defineClass(name, b, 0, b.length);
                } catch (IOException e) {
                    e.printStackTrace();
                }

                return super.loadClass(name);
            }
        };

        Class<?> obj = classLoader.loadClass("com.example.kevinweb.ClassLoader.DifferentClassLoaderTest");
        System.out.println(obj.getClass());
        //System.out.println(obj instanceof DifferentClassLoaderTest);

        //DifferentClassLoaderTest objj = (DifferentClassLoaderTest) classLoader.loadClass("jvm.DifferentClassLoaderTest").newInstance();

        java.sql.DriverManager.getConnection("");

    }



}
