package com.gavin.finance.repository.dao.impl;

import com.gavin.finance.exception.DatabaseException;
import com.gavin.finance.repository.dao.interf.UserDao;
import com.gavin.finance.repository.mybatis.interf.UserMybatisRepository;
import com.gavin.finance.pojo.User;
import org.springframework.stereotype.Component;

import javax.inject.Inject;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Component
public class UserDaoImpl implements UserDao {

    @Inject
    private UserMybatisRepository userMybatisRepository;

    @Override
    public User getUserById(int id) throws DatabaseException {
        return userMybatisRepository.getUserById(id);
    }
}
