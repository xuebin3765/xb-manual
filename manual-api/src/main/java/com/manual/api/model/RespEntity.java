package com.manual.api.model;

import com.alibaba.fastjson.JSON;
import com.manual.api.constant.ResponseCode;
import com.manual.api.constant.ResponseMsg;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
public class RespEntity {
    private String respCode;
    private String respMsg;
    private String data;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public RespEntity() {}

    public RespEntity(String respCode, String respMsg, String data) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.data = data;
    }

    public static String success(Object object){
        RespEntity respEntity = new RespEntity();
        respEntity.setRespCode(ResponseCode.success);
        respEntity.setRespMsg(ResponseMsg.success);
        respEntity.setData(JSON.toJSONString(object));
        return respEntity.toString();
    }

    public static String error(Object object){
        RespEntity respEntity = new RespEntity();
        respEntity.setRespCode(ResponseCode.error);
        respEntity.setRespMsg(ResponseMsg.error);
        return respEntity.toString();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
