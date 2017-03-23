package com.gavin.finance.repository.mybatis.interf;

import com.gavin.finance.exception.DatabaseException;
import com.gavin.finance.pojo.User;

/**
 * Created by ligaozhao on 23/03/17.
 */
public interface UserMybatisRepository {
    User getUserById(final int id) throws DatabaseException;
}
