package com.sheziong.bootlaunchdemo.jpa.testdb2;

import org.springframework.data.jpa.repository.JpaRepository;


/**
 * @author zfshe
 * @date 2020/4/29 17:37
 */
public interface MessageRepository extends JpaRepository<Message, Long> {
}
