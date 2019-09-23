package com.manual.api.controller;

import com.manual.api.ApplicationManualApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@RestController
@RequestMapping("/api/user")
public class UserController {
    private static final Logger logger = LoggerFactory.getLogger(ApplicationManualApi.class);
}
