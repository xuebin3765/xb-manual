package com.manual.api.model;

import com.alibaba.fastjson.JSON;
import com.manual.api.constant.ResponseCode;
import com.manual.api.constant.ResponseMsg;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * desc:
 * author: xuebin3765@163.com
 * date: 2019/09/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RespEntity {
    private String respCode;
    private String respMsg;
    private String data;

    public static String success(){
        return new RespEntity.RespEntityBuilder()
                .respCode(ResponseCode.success)
                .respMsg(ResponseMsg.success)
                .build()
                .toString();
    }

    public static String success(Object object){
        return new RespEntity.RespEntityBuilder()
                .respCode(ResponseCode.success)
                .respMsg(ResponseMsg.success)
                .data(JSON.toJSONString(object))
                .build()
                .toString();
    }

    public static String success(Object object, String respMsg){
        return new RespEntity.RespEntityBuilder()
                .respCode(ResponseCode.success)
                .respMsg(respMsg)
                .data(JSON.toJSONString(object))
                .build()
                .toString();
    }

    public static String success(String respMsg){
        return new RespEntity.RespEntityBuilder()
                .respCode(ResponseCode.success)
                .respMsg(respMsg)
                .build()
                .toString();
    }

    public static String error(String respCode, String respMsg){

        return new RespEntity.RespEntityBuilder()
                .respCode(respCode)
                .respMsg(respMsg)
                .build()
                .toString();
    }

    public static String error(String respMsg){
        return new RespEntity.RespEntityBuilder()
                .respMsg(respMsg)
                .respCode(ResponseCode.error)
                .build()
                .toString();
    }

    public static String error(){
        return new RespEntity.RespEntityBuilder()
                .respMsg(ResponseMsg.error)
                .respCode(ResponseCode.error)
                .build()
                .toString();
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
