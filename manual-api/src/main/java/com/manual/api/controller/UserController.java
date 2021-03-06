package com.manual.api.controller;

import com.commons.validator.ValidResult;
import com.commons.validator.ValidatorFactory;
import com.manual.api.dto.user.UserModifyDTO;
import com.manual.api.dto.user.UserRegisterDTO;
import com.manual.api.entity.User;
import com.manual.api.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * desc: 用户控制类
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Api("用户操作接口")
@RestController
@RequestMapping("/api/user")
public class UserController extends BaseController{

    @Resource
    private UserService userService;

    @RequestMapping(value = "/register",method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String register(@RequestBody UserRegisterDTO registerDTO){
        info("step into register user: {}", registerDTO);
        ValidResult validResult = ValidatorFactory.validBean(registerDTO);
        if (validResult.isHasErrors()){
            return error(validResult.getSimpleErrors());
        }
        User user = userService.findByUserName(registerDTO.getUserName());
        if (null != user){
            debug("user exits:", user);
            return error("用户已存在");
        }

        if (!registerDTO.getPassword().equals(registerDTO.getRepPassword())){
            debug("两次密码不一致");
            return error("两次密码不一致");
        }
        user = userService.register(registerDTO);
        if (user == null){
            return error();
        }
        info("step out add user: ", user);
        return success(user);
    }

    @RequestMapping(value = "/modify",method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String modify(@RequestBody @Valid UserModifyDTO userModifyDTO){
        debug("step into modify user: {}", userModifyDTO);
        ValidResult validResult = ValidatorFactory.validBean(userModifyDTO);
        if (validResult.isHasErrors()){
            return error(validResult.getSimpleErrors());
        }
        User user = userService.findById(userModifyDTO.getId());
        if (null == user){
            return error("用户不存在!");
        }
        user = userService.modify(user, userModifyDTO);
        if (user == null){
            return error("params has null");
        }
        debug("step out add user: ", user);
        return success(user);
    }

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String delete(@RequestParam long id){
        debug("step into delete user, id: {}", id);

        User user = userService.findById(id);
        if (null == user){
            return error("用户不存在!");
        }
        userService.delete(user);
        debug("step out add user: ", user);
        return success();
    }
}
