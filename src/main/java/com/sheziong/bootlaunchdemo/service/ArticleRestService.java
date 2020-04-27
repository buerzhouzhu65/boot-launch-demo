package com.sheziong.bootlaunchdemo.service;

import com.sheziong.bootlaunchdemo.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author zfshe
 * @date 2020/4/27 11:13
 */
@Slf4j
@Service
public class ArticleRestService {
    public String saveArticle(Article article) {
        log.info("saveArticle:"+article);
        return "测试";
    }

}
