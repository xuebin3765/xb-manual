package com.manual.api.dto.user;

import javax.validation.constraints.NotNull;

/**
 * @Author guodandan
 * @Date 2019/9/24 23:25
 */
public class UserAddDTO extends UserDTO{

    @NotNull(message = "确认密码不能为空")
    private String repPassword;
    private String address;

    public String getRepPassword() {
        return repPassword;
    }

    public void setRepPassword(String repPassword) {
        this.repPassword = repPassword;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
