package com.manual.api.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModifyDTO implements Serializable {
    @NotNull
    private long id;
    @NotNull
    private String password;
    @NotNull
    private String rePassword;
}
