package com.atyang.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 此类是用于传输给前端使用的
 * @param <T>   不同业务使用不同的实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;

    public CommonResult(int code,String message){
        this.code = code;
        this.message = message;
    }
}
