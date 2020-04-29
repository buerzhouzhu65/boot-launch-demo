package com.sheziong.bootlaunchdemo.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ArticleRepository extends JpaRepository<Article,Long> {
    Article findByAuthor(String author);
    List<Article> findByAuthorAndTitle(String author, String title);
}