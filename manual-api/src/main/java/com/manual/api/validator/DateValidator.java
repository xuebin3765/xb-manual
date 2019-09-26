package com.manual.api.validator;

import javax.validation.*;
import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/26
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = {DateValidator.DateValidatorInner.class})
public @interface DateValidator {

    /**
     * 必须的属性
     * 显示 校验信息
     * 利用 {} 获取 属性值，参考了官方的message编写方式
     *
     * @see org.hibernate.validator 静态资源包里面 message 编写方式
     */
    String message() default "日期格式不匹配{dateFormat}";

    /**
     * 必须的属性
     * 用于分组校验
     */
    Class<?>[] groups() default {};


    Class<? extends Payload>[] payload() default {};

    /**
     * 非必须
     */
    String dateFormat() default "yyyy-MM-dd HH:mm:ss";

    /**
     * 必须实现 ConstraintValidator接口
     */
    class DateValidatorInner implements ConstraintValidator<DateValidator, String>{
        private String dateFormat;

        @Override
        public void initialize(DateValidator constraintAnnotation) {

        }

        @Override
        public boolean isValid(String value, ConstraintValidatorContext context) {
            return false;
        }
    }
}
