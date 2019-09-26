package com.manual.api.dto.user;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * @Author guodandan
 * @Date 2019/9/24 23:35
 */
@Data
public class UserDTO {
    @NotNull(message = "用户名不能为空")
    private String userName;
    @NotNull(message = "密码不能为空")
    private String password;
}
