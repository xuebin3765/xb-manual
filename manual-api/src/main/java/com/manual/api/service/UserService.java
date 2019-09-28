package com.manual.api.service;

import com.manual.api.dto.user.UserModifyDTO;
import com.manual.api.dto.user.UserRegisterDTO;
import com.manual.api.entity.User;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public interface UserService {

    User findByUserName(String username);

    User register(UserRegisterDTO registerDTO);

    User findById(long id);

    User modify(User user, UserModifyDTO userModifyDTO);

    void delete(User user);
}
