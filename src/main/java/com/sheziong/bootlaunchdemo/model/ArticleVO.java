package com.sheziong.bootlaunchdemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author zfshe
 * @date 2020/4/28 20:59
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleVO {
    private Long id;

    private String author;

    private String title;

    private String context;

    private Date createTime;

    private List<Reader> readers;

}
