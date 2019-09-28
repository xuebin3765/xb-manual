package com.manual.api.repository;

import com.manual.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * desc: user mapping
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public interface UserRepository extends JpaRepository<User, String> {

    User findUserById(Long id);

    User findUserByUserName(String userName);

//    User findUserByAccount(String account);
}
