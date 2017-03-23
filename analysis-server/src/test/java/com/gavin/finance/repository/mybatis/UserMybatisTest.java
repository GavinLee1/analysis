package com.gavin.finance.repository.mybatis;

import com.gavin.finance.pojo.User;
import com.gavin.finance.repository.mybatis.impl.UserMybatisRepositoryImpl;
import com.gavin.finance.repository.mybatis.interf.UserMybatisRepository;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ligaozhao on 23/03/17.
 */
public class UserMybatisTest {

    private UserMybatisRepository userMybatisRepository;

    @Before
    public void setUp() throws Exception {
        userMybatisRepository = new UserMybatisRepositoryImpl(
                TestEnvLoaderMybatis.sqlSessionTemplate(TestEnvLoaderMybatis.sqlSessionFactory())
        );
    }

    @Test
    public void testGetUserById() throws Exception {
        User user = userMybatisRepository.getUserById(1);
        assertEquals("init", user.getRemark());
        assertEquals("test@gmail.com", user.getEmail());
        assertEquals("1383838438", user.getPhone());
        assertEquals(1, user.getGender());
    }
}
