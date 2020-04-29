package com.sheziong.bootlaunchdemo.jpa.testdb;

import com.sheziong.bootlaunchdemo.jpa.testdb.Article;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String author);
    List<Article> findByAuthorAndTitle(String author, String title);
}