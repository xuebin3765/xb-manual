package com.manual.api.controller;

import com.manual.api.model.RespEntity;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public class BaseController {
    protected String success(Object object){
        return RespEntity.success(object).toString();
    }

    protected String success(Object object, String respCode, String respMsg){
        return RespEntity.success(object).toString();
    }

    protected String error(Object object){
        return RespEntity.success(object).toString();
    }

    protected String error(Object object, String respCode, String respMsg){
        return RespEntity.success(object).toString();
    }
}
