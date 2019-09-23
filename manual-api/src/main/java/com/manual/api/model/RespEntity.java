package com.manual.api.model;

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
}
