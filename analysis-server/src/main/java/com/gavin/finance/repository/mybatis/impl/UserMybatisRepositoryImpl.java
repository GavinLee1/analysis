package com.gavin.finance.repository.mybatis.impl;

import com.gavin.finance.exception.DatabaseException;
import com.gavin.finance.repository.mybatis.interf.UserMybatisRepository;
import com.gavin.finance.repository.mybatis.mapper.UserMapper;
import com.gavin.finance.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Repository
public class UserMybatisRepositoryImpl implements UserMybatisRepository {

    private SqlSession sqlSession;

    private final static Logger log = LoggerFactory.getLogger(UserMybatisRepositoryImpl.class);

    @Inject
    public UserMybatisRepositoryImpl(@Named("sqlSessionTemplate") SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    private UserMapper getMapper() {
        return this.sqlSession.getMapper(UserMapper.class);
    }

    @Override
    public User getUserById(int id) throws DatabaseException {
        User user = null;
        try {
            user = getMapper().selectUserById(id);
        } catch (Exception e) {
            log.error("[getUserById] - Fail to access DB - id[{}]", id, e);
            throw new DatabaseException("[getUserById] - Fail to access DB - id[" + id + "]", e);
        }

        if (user == null) {
            throw new DatabaseException("[getUserById] - User Not Found - id[" + id + "]");
        }
        if (log.isDebugEnabled()) {
            log.debug("[Y] - [[getUserById]] - Found user[{}] - id[{}]", user.toString(), id);
        }
        return user;
    }
}
