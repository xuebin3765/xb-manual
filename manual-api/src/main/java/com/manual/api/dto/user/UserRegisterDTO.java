package com.manual.api.dto.user;

import com.manual.api.validator.DateValidator;
import com.manual.api.validator.groups.RegisterGroup;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

/**
 * desc: 用户注册dto
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
@Data
public class UserRegisterDTO extends UserDTO {
    @NotNull(message = "确认密码不能为空")
    private String repPassword;
    @NotNull
    @Pattern(regexp = "[A-z]+[A-z0-9_-]*\\\\@[A-z0-9]+\\\\.[A-z]+")
    private String email;

    @DateValidator(dateFormat = "yyyy-MM-dd", groups = {RegisterGroup.class})
    private String birthday;

}
