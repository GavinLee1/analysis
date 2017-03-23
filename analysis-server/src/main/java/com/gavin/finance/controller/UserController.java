package com.gavin.finance.controller;

import com.gavin.finance.api.UserService;
import com.gavin.finance.message.UserService.GetUserByIdReq;
import com.gavin.finance.message.UserService.GetUserByIdResp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.inject.Inject;

/**
 * Created by ligaozhao on 23/03/17.
 */
@Controller
@RequestMapping("/account")
public class UserController {

    @Inject
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get-user-by-id", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public GetUserByIdResp getUserById(GetUserByIdReq req) {
        return userService.getUserById(req);
    }
}
