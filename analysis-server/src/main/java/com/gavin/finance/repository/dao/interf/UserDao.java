package com.gavin.finance.repository.dao.interf;

import com.gavin.finance.exception.DatabaseException;
import com.gavin.finance.pojo.User;

/**
 * Created by ligaozhao on 23/03/17.
 */
public interface UserDao {
    User getUserById(int id) throws DatabaseException;
}
