package com.manual.api.utils;

import com.google.common.collect.Lists;
import lombok.Data;
import org.hibernate.validator.HibernateValidator;

import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * desc: 参数验证工具类
 * author: xuebin3765@163.com
 * date: 2019/09/25
 */
public class ValidationUtil {
    /**
     * 开启快速结束模式
     */

    private static Validator validator = Validation.byProvider(HibernateValidator.class)
            .configure()
            .failFast(false) // 关闭快速结束模式
            .buildValidatorFactory()
            .getValidator();

    @Data
    public class ValidResult{
        /**
         * 是否有错误
         */
        private boolean hasErrors;
        /**
         * 错误信息列表
         */
        private List<ErrorMsg> errorMsgs;

        public ValidResult() {
            this.errorMsgs = Lists.newArrayList();
        }

        /**
         * 添加错误
         * @param propertyName 参数名
         * @param message 错误描述
         */
        public void addError(String propertyName, String message){
            this.errorMsgs.add(new ErrorMsg(propertyName, message));
        }

        /**
         * 获取错误的字段名称，用逗号隔开
         * 去重错误字段
         * @return 错误字段信息
         */
        public String getProperties(){
            return errorMsgs
                    .stream()
                    .map(ErrorMsg::getPropertyPath)
                    .collect(Collectors.toSet())
                    .stream()
                    .collect(Collectors.joining(", "));
        }

        public String getErrors(){
//            return String.join(",", errorMsgs)
            StringBuilder sb = new StringBuilder();
            for (ErrorMsg msg :errorMsgs) {
                sb.append(msg.getPropertyPath())
                        .append(":")
                        .append(msg.getMessage());
            }
            return null;
        }
    }

    @Data
    public class ErrorMsg{
        private String propertyPath;
        private String message;

        public ErrorMsg() {
        }

        public ErrorMsg(String propertyPath, String message) {
            this.propertyPath = propertyPath;
            this.message = message;
        }

        public String toStr(){
            return this.propertyPath + ":" + this.message;
        }
    }
}
