package com.example.demospring.utils;

public class Result<T> {

    /*错误码
     *200: 成功
     *500 :错误
     * 501:bean验证错误
     * 502:拦截器拦截到哦用户token出错
     * 555 :异常抛出信息
     * */
    private Integer code;

    /*提示信息 */
    private String msg;

    /*具体内容*/
    private T data;

        //成功的接受类
    public Result(T data) {
        this.code = 200;
        this.msg = "ok";
        this.data = data;
    }

    //错误的接收类
    public Result(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }


    /**
     * 请求成功返回
     *
     * @param object
     * @return
     */
    public static Result success(Object object) {
        return new Result(object);
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        return new Result(code, msg);
    }

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
}
