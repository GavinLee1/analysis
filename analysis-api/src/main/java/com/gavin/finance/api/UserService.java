package com.gavin.finance.api;

import com.gavin.finance.message.UserService.GetUserByIdReq;
import com.gavin.finance.message.UserService.GetUserByIdResp;

/**
 * Created by ligaozhao on 23/03/17.
 */
public interface UserService {

    GetUserByIdResp getUserById(GetUserByIdReq req);
}
