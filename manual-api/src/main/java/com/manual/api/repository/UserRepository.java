package com.manual.api.repository;

import com.manual.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * desc: user mapping
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Repository
public interface UserRepository extends JpaRepository<User, String> {

}
