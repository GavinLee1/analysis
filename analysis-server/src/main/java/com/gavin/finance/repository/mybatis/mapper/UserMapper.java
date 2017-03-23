package com.gavin.finance.repository.mybatis.mapper;

import com.gavin.finance.pojo.User;

/**
 * Created by ligaozhao on 23/03/17.
 */
public interface UserMapper {
    User selectUserById(final int id);
}
