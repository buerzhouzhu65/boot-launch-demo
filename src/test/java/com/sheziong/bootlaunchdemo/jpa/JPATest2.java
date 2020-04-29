package com.sheziong.bootlaunchdemo.jpa;

import com.sheziong.bootlaunchdemo.dao.ArticleRepository;
import com.sheziong.bootlaunchdemo.model.Article;
import com.sheziong.bootlaunchdemo.model.ymal.Family;
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