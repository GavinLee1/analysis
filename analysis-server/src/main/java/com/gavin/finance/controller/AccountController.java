package com.gavin.finance.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountController {

    @ResponseBody
    @RequestMapping(value = "/health", method = RequestMethod.GET)
    public String getMaxUserId() {
        return "OK";
    }
}
