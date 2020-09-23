package com.suwian.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author : sirc_hzr
 * @version : 1.0
 * @date : 2020/4/18 14:07
 */
@Data
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> implements Serializable {

    /**
     * 操作状态码
     */
    private int code;

    /**
     * 操作返回的消息信息
     */
    private String message;

    /**
     * 返回的数据
     */
    private T data;
}
