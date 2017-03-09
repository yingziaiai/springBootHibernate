package com.springBootHibernate.Error;

/**
 * Created by fionalyn.ping.fu on 2/26/2017.
 */
public class RestApiResult {
    private String code;
    private String message;
    private Object data;

    public RestApiResult() {
        this.setCode(ResultCode.SUCCESS);
        this.setMessage("成功！");

    }

    public RestApiResult(ResultCode code) {
        this.setCode(code);
        this.setMessage(code.msg());
    }

    public RestApiResult(ResultCode code, String message) {
        this.setCode(code);
        this.setMessage(message);
    }

    public RestApiResult(ResultCode code, String message, Object data) {
        this.setCode(code);
        this.setMessage(message);
        this.setData(data);
    }

    public String getCode() {
        return code;
    }
    public void setCode(ResultCode code) {
        this.code = code.val();
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
