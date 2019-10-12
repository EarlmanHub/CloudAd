package com.itgone.ad.vo;

import lombok.Data;

@Data
public class CommonResponse<T> {

    private static final int CODE_SUCCESS = 0;
    private static final int CODE_FAILURE = -1;

    private Integer code;
    private String message;
    private T data;

    public static <T> CommonResponse<T> success(T data) {
        CommonResponse<T> response = new CommonResponse<>();
        response.setCode(CODE_SUCCESS);
        response.setData(data);
        return response;
    }

    public static CommonResponse<Void> failure(String msg) {
        CommonResponse<Void> response = new CommonResponse<>();
        response.setCode(CODE_FAILURE);
        response.setMessage(msg);
        return response;
    }

}
