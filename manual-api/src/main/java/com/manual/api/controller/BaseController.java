package com.manual.api.controller;

import com.manual.api.ApplicationManualApi;
import com.manual.api.model.RespEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public class BaseController {

//    private static final Logger logger = LoggerFactory.getLogger(ApplicationManualApi.class);

    protected String success(Object object){
        return RespEntity.success(object).toString();
    }

    protected String success(Object object, String respCode, String respMsg){
        return RespEntity.success(object).toString();
    }

    protected String error(String respMsg){
        return RespEntity.error(respMsg).toString();
    }

    protected String error(String respCode, String respMsg){
        return RespEntity.error(respCode, respMsg).toString();
    }

    public void debug(String format, Object mssage){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.debug(format, mssage);
    }

    public void debug(String msg){
        Logger logger = LoggerFactory.getLogger(this.getClass());
        logger.debug(msg);
    }
}
