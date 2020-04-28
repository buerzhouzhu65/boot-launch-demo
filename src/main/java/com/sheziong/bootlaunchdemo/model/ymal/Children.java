package com.sheziong.bootlaunchdemo.model.ymal;

import lombok.Data;

import java.util.List;

/**
 * @author zfshe
 * @date 2020/4/27 16:32
 */
@Data
public class Children {
    private String name;
    private Integer age;
    private List<Friend> friends;
}
