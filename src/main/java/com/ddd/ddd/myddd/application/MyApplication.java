package com.ddd.ddd.myddd.application;

import org.springframework.transaction.annotation.Transactional;

/**
 * 领域模型不用事务
 * 这里使用事务
 */
public class MyApplication {

    @Transactional
    public void createUser() {

    }
}
