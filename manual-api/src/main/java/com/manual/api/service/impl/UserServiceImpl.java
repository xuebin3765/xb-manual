package com.manual.api.service.impl;

import com.manual.api.controller.BaseLogs;
import com.manual.api.dto.user.UserModifyDTO;
import com.manual.api.dto.user.UserRegisterDTO;
import com.manual.api.entity.User;
import com.manual.api.repository.UserRepository;
import com.manual.api.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * desc: user service
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Service
public class UserServiceImpl extends BaseLogs implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserRepository userRepository;

    @Override
    public User findByUserName(String username) {
        info("step into findByUserName, username: {}", username);
        return userRepository.findUserByUserName(username);
    }

    @Override
    public User register(UserRegisterDTO registerDTO) {
        info("step into register, registerDTO: {}", registerDTO);
        User user = new User();
        user.setCreateTime(System.currentTimeMillis());
        user.setModifyTime(System.currentTimeMillis());
        BeanUtils.copyProperties(registerDTO, user);
        info("step out method register.");
        debug("save user: {}", user);
        return userRepository.save(user);
    }

    @Override
    public User findById(long id) {
        info("step into findById, id: {}", id);
        return userRepository.findUserById(id);
    }

    @Override
    public User modify(User user, UserModifyDTO userModifyDTO) {
        info("step into modify, User: {}, UserModifyDTO: {}", user, userModifyDTO);
        user.setModifyTime(System.currentTimeMillis());
        if (StringUtils.isNotBlank(userModifyDTO.getPassword())){
            debug("step into modify, update password");
            user.setPassword(userModifyDTO.getPassword());
        }
        info("step out modify");
        return userRepository.saveAndFlush(user);
    }

    @Override
    public void delete(User user) {
        info("step into delete, user: {}", user);
        userRepository.delete(user);
    }

}
