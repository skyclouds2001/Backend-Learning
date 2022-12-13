package org.sky.controller;

public class RequestResult {

    private Object data;

    private Integer code;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    private String message;

    private Boolean success;

    public RequestResult() {}

    public RequestResult(Integer code, String message, Boolean success, Object data) {
        this.data = data;
        this.code = code;
        this.message = message;
        this.success = success;
    }

}
