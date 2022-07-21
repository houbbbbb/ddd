package com.ddd.ddd.myddd.infrastructure;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ddd.ddd.myddd.domain.model.user.User;
import com.ddd.ddd.myddd.domain.model.user.UserRepository;
import org.springframework.stereotype.Repository;

/**
 * 通过接口继承实现UserRepository与具体数据库的解耦
 */
@Repository
public interface MysqlUserRepository
        extends UserRepository, BaseMapper<User> {
}
