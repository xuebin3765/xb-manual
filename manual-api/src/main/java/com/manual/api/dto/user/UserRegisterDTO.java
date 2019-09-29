package com.manual.api.dto.user;

import com.commons.validator.annotation.Equals;
import com.manual.api.validator.DateValidator;
import com.manual.api.validator.groups.RegisterGroup;
import lombok.Data;


/**
 * desc: 用户注册dto
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
@Data
public class UserRegisterDTO extends UserDTO {
    @Equals("password")
    private String repPassword;
//    @NotNull
//    @Pattern(regexp = "[A-z]+[A-z0-9_-]*\\\\@[A-z0-9]+\\\\.[A-z]+")
    private String email;

    @DateValidator(dateFormat = "yyyy-MM-dd", groups = {RegisterGroup.class})
    private String birthday;

}
