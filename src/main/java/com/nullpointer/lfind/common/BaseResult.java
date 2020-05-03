package com.nullpointer.lfind.common;

import java.io.Serializable;

public class BaseResult<T> implements Serializable {


    private static final long serialVersionUID = -4707547234874315893L;
    //0成功，-1失败
    private Integer code;
    private String msg;
    private T data;//Object也可以

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public BaseResult() {
    }

    public BaseResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public BaseResult(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> BaseResult<T> success(T t) { return new BaseResult<>(0, "SUCCESS", t); }


    public static <T> BaseResult<T> fail(String message) { return new BaseResult<>(-1, message); }
}