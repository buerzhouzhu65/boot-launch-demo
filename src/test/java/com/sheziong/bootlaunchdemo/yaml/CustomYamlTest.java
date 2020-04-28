package com.sheziong.bootlaunchdemo.yaml;

import com.sheziong.bootlaunchdemo.model.ymal.Family;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CustomYamlTest {

    @Autowired
    Family family;

    @Test
    void hello() {
        System.out.println(family.toString());
    }

}