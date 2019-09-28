package com.manual.api.controller;

import com.manual.api.constant.ResponseMsg;
import com.manual.api.dto.user.UserModifyDTO;
import com.manual.api.dto.user.UserRegisterDTO;
import com.manual.api.entity.User;
import com.manual.api.service.UserService;
import com.manual.api.utils.ValidationUtil;
import com.manual.api.validator.groups.RegisterGroup;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@RequestBody UserRegisterDTO registerDTO){
        info("step into register user: {}", registerDTO);
        ValidationUtil.ValidResult validResult = ValidationUtil.validBean(registerDTO, RegisterGroup.class);
        if (validResult.isHasErrors()){
            return error(validResult.getErrors());
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

    @RequestMapping(value = "/modify",method = RequestMethod.PUT)
    public String modify(@RequestBody @Valid UserModifyDTO userModifyDTO){
        debug("step into modify user: {}", userModifyDTO);
        debug("step into add user");
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

    @RequestMapping(value = "/delete",method = RequestMethod.DELETE)
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
