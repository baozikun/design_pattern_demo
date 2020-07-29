package com.baozi.design_pattern_demo;

import com.baozi.design_pattern_demo.singleton.Singleton01;
import com.baozi.design_pattern_demo.singleton.Singleton05;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DesignPatternDemoApplicationTests {

    @Test
    void t1() {
        Singleton05 instance1 = Singleton05.INSTANCE;
        Singleton05 instance2 = Singleton05.INSTANCE;
        System.out.println(instance1==instance2);
    }

}
