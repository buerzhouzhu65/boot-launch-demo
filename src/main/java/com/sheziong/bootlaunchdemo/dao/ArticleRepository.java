package com.sheziong.bootlaunchdemo.dao;

import com.sheziong.bootlaunchdemo.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article,Long> {
}