package com.sheziong.bootlaunchdemo.service;

import com.sheziong.bootlaunchdemo.jpa.testdb.ArticleRepository;
import com.sheziong.bootlaunchdemo.jpa.testdb.Article;
import com.sheziong.bootlaunchdemo.jpa.testdb2.Message;
import com.sheziong.bootlaunchdemo.jpa.testdb2.MessageRepository;
import com.sheziong.bootlaunchdemo.model.ArticleVO;
import com.sheziong.bootlaunchdemo.service.impl.ArticleRestJPAService;
import com.sheziong.bootlaunchdemo.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

/**
 * @author zfshe
 * @date 2020/4/28 21:33
 */
@Service
public class ArticleRestJPAServiceImpl implements ArticleRestJPAService {
    //将JPA仓库对象注入
    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private MessageRepository messageRepository;

    @Resource
    private Mapper dozerMapper;

    @Transactional
    public ArticleVO saveArticle( ArticleVO article) {

        Article articlePO = dozerMapper.map(article,Article.class);
        articleRepository.save(articlePO);    //保存一个对象到数据库，insert
        messageRepository.save(new Message(null,"zimug","爱学习"));
//        int a= 2/0;

        return  article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleRepository.deleteById(id);   //根据id删除1条数据库记录
    }

    @Override
    public void updateArticle(ArticleVO article) {
        Article articlePO = dozerMapper.map(article,Article.class);
        articleRepository.save(articlePO);   //更新一个对象到数据库，仍然使用save方法
    }

    @Override
    public ArticleVO getArticle(Long id) {
        Optional<Article> article = articleRepository.findById(id);  //根据id查找一条数据
        return dozerMapper.map(article.get(),ArticleVO.class);
    }

 /*   @Override
    public List<ArticleVO> getArticleByAuthorAndTitle(String author, String title) {
        List<Article> articleLis = (List<Article>) articleRepository.findByAuthorAndTitle(author, title);  //根据author和title查找一条数据
        return DozerUtils.mapList(articleLis,ArticleVO.class);
    }*/

    @Override
    public List<ArticleVO> getAll() {
        List<Article> articleLis = articleRepository.findAll();  //查询article表的所有数据
        return DozerUtils.mapList(articleLis,ArticleVO.class);
    }
}
