package com.gavin.finance.api;

import com.gavin.finance.exception.DatabaseException;
import com.gavin.finance.message.UserService.GetUserByIdReq;
import com.gavin.finance.message.UserService.GetUserByIdResp;
import com.gavin.finance.pojo.User;
import com.gavin.finance.repository.dao.interf.UserDao;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Service
public class UserServiceImpl implements UserService {

    @Inject
    private UserDao userDao;

    private final static String NULL_REQ = "Null Request!";

    @Override
    public GetUserByIdResp getUserById(GetUserByIdReq req) {
        if (req == null) {
            return new GetUserByIdResp(false, NULL_REQ);
        }

        User user = null;
        try {
            user = userDao.getUserById(req.getId());
        } catch (DatabaseException e) {
            return new GetUserByIdResp(false, e.toString());
        }

        return new GetUserByIdResp(user);
    }
}
