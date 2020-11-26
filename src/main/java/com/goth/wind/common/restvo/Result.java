package com.goth.wind.common.restvo;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yuanjianfeng
 * @date 2020/11/26
 * @desc 返回交互
 */
@Data
public class Result<T> implements Serializable {

    /**
     * 成功标志
     */
    private boolean success;

    /**
     * 信息
     */
    private String msg;

    /**
     * 返回代码
     */
    private Integer code;

    /**
     * 返回数据
     */
    private T result;

}
