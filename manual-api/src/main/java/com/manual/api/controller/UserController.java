package com.manual.api.controller;

import com.manual.api.ApplicationManualApi;
import com.manual.api.constant.ResponseMsg;
import com.manual.api.dto.user.UserAddDTO;
import com.manual.api.entity.User;
import com.manual.api.service.UserService;
import io.swagger.annotations.Api;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Api("用户操作接口")
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController{



    @Resource
    private UserService userService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(@RequestBody @Valid UserAddDTO userAddDTO){
        debug("step into add user: {}", userAddDTO);
        debug("step into add user");
        User user = userService.findByUserName(userAddDTO.getUserName());
        if (null != user){
            return error(ResponseMsg.UserAlreadyExists);
        }
        user = userService.add(userAddDTO);
        if (user == null){
            return error("params has null");
        }
        debug("step out add user: ", user);
        return success(user);
    }
}
