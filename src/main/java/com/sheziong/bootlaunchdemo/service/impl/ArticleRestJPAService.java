package com.sheziong.bootlaunchdemo.service;

import com.sheziong.bootlaunchdemo.model.ArticleVO;

import java.util.List;

/**
 * @author zfshe
 * @date 2020/4/28 20:57
 */
public interface ArticleRestJPAService {
    ArticleVO saveArticle(ArticleVO article);

    void deleteArticle(Long id);

    void updateArticle(ArticleVO article);

    ArticleVO getArticle(Long id);

//    List<ArticleVO> getArticleByAuthorAndTitle(String author, String title);

    List<ArticleVO> getAll();
}
