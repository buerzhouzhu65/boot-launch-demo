package com.sheziong.bootlaunchdemo.jpa;

import com.sheziong.bootlaunchdemo.jpa.testdb.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JPATest2 {

    @Autowired
    ArticleRepository articleRepository;

    @Test
    void hello() {
        System.out.println(articleRepository.findByAuthorAndTitle("zimug", "手摸手教你开发spring boot1"));
    }

}