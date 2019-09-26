package com.manual.api.service.impl;

import com.manual.api.dto.user.UserAddDTO;
import com.manual.api.entity.User;
import com.manual.api.repository.UserRepository;
import com.manual.api.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * desc: user service
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Service
public class UserServiceImpl implements UserService {

    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    @Resource
    private UserRepository userRepository;

    @Override
    public User add(UserAddDTO userAddDTO) {
        if (null == userAddDTO || StringUtils.isBlank(userAddDTO.getUsername())
                || StringUtils.isBlank(userAddDTO.getPassword())
                || StringUtils.isBlank(userAddDTO.getRepPassword())){
            logger.debug("add has null values");
            return null;
        }
        User user = new User();
        BeanUtils.copyProperties(user, userAddDTO);
        if (userAddDTO.getRepPassword().equals(user.getPassword())){
            logger.debug("");
        }
//        userRepository.save(user);
        return null;
    }

    @Override
    public User findByUserName(String username) {
        return null;
    }
}
