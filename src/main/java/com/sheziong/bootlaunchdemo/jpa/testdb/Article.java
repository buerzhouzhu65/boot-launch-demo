package com.sheziong.bootlaunchdemo.jpa.testdb;



import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



import javax.persistence.*;
import java.util.Date;


/**
 * @author zfshe
 * @date 2020/4/25 13:23
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="article")

public class Article {


    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false,length = 32)
    private String author;

    @Column(nullable = false, unique = true,length = 32)
    private String title;

    @Column(length = 512)
    private String context;

    private Date createTime;

}
