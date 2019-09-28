package com.manual.api.validator;

import java.lang.annotation.*;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface NeedLogin {
}
