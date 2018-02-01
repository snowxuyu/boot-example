package com.boot.example.exception;

import lombok.Data;

/**
 * date: 2018-2-1 21:26
 * author: snowxuyu
 * describe:
 */
@Data
public class ErrorInfo<T> {

    public static final Integer OK = 0;
    public static final Integer ERROR = 100;

    private Integer code;
    private String message;
    private String url;
    private T data;
}
