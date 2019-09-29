package com.manual.api.dto.user;

import com.commons.validator.annotation.Email;
import com.commons.validator.annotation.Equals;
import lombok.Data;


/**
 * desc: 用户注册dto
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
@Data
public class UserRegisterDTO extends UserDTO {
    @Equals(value = "password", message = "两次密码不一致")
    private String repPassword;

    @Email("请输入正确的邮箱地址")
    private String email;

}
