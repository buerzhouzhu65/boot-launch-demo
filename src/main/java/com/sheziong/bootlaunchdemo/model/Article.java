package com.sheziong.bootlaunchdemo.model;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author zfshe
 * @date 2020/4/25 13:23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Article {


    private Long id;
    private String author;
    private String title;
    private String context;
    private Date createTime;
    private List<Reader> reader;
}
