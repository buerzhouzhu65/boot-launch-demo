package com.sheziong.bootlaunchdemo.jpa;

import com.sheziong.bootlaunchdemo.jpa.testdb.Article;
import com.sheziong.bootlaunchdemo.jpa.testdb.ArticleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JPATest {

    @Autowired
    ArticleRepository articleRepository;

    @Test
    void hello() {
        Article article = articleRepository.findByAuthor("bigwolf");
        System.out.println(article.toString());
    }

}