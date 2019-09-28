package com.manual.api.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * desc: 字符串工具类
 * author: xuebin3765@163.com
 * date: 2019/09/27
 */
public class StringUtil {

    public static String firstChar2UpperCase(String var){
        if (StringUtils.isBlank(var)) return var;
        String first = var.substring(0,1);
        String last = var.substring(1);
        return first.toUpperCase() + last;
    }
}
