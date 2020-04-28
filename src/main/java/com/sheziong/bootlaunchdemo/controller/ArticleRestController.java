package com.sheziong.bootlaunchdemo.controller;

import com.sheziong.bootlaunchdemo.model.AjaxResponse;

import com.sheziong.bootlaunchdemo.model.ArticleVO;
import com.sheziong.bootlaunchdemo.service.ArticleRestJPAService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;


import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * @author zfshe
 * @date 2020/4/25 13:25
 */
@Slf4j
@RestController
@RequestMapping("/rest")
public class ArticleRestController {
    @Resource(name = "articleRestJPAServiceImpl")
    ArticleRestJPAService articleRestJPAService;

    // 增加一篇文章，采用POST方法
    @RequestMapping(value = "/article", method = POST, produces = "application/json")
    public AjaxResponse saveArticle(@RequestBody ArticleVO article) {
        articleRestJPAService.saveArticle(article);
        return AjaxResponse.success(article);
    }

    // 删除一篇文章，采用DELETE方法，参数是id
    // 通过 @PathVariable 可以将 URL 中占位符参数绑定到控制器处理方法的入参中：
    // URL 中的 {xxx} 占位符可以通过@PathVariable(“xxx“) 绑定到操作方法的入参中。
    // URL为http://localhost:8888/rest/article/1
    @RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    public AjaxResponse deleteArticle(@PathVariable Long id) {
        articleRestJPAService.deleteArticle(id);
        return AjaxResponse.success(id);
    }

    // 更新一篇文章，采用PUT方法，参数是id
    @RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    public AjaxResponse updateArticle(@PathVariable Long id, @RequestBody ArticleVO article) {
        article.setId(id);
        articleRestJPAService.updateArticle(article);
        return AjaxResponse.success(article);
    }

    // 获取一篇article，采用GET方法
    @RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    public AjaxResponse getArticle(@PathVariable("id") Long id) {
        ArticleVO article = articleRestJPAService.getArticle(id);
        return AjaxResponse.success(article);
    }

    // 获取所有的article，采用GET方法
    @RequestMapping(value = "/article", method = GET, produces = "application/json")
    public AjaxResponse getAll() {
        return AjaxResponse.success(articleRestJPAService.getAll());
    }

}
