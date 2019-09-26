package com.manual.api.validator;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.ConstraintViolation;
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

    String message() default "日期格式不匹配{dateFormat}";

    Class<?>[] groups() default {};

    String dateFormat() default "yyyy-MM-dd HH:mm:ss";

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
