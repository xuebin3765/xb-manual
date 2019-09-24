package com.manual.api.repository;

import com.manual.api.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

/**
 * desc: user mapping
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Mapper
public interface UserMapper {

    @Insert("insert into ")
    public User add(User user);
}
