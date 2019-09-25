package com.manual.api.service;

import com.manual.api.dto.user.UserAddDTO;
import com.manual.api.entity.User;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public interface UserService {
    User add(UserAddDTO userAddDTO);

    User findByUserName(String username);
}
