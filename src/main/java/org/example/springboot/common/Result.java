package org.example.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author bailiang
 */
@Data
@AllArgsConstructor
public class Result {
    /**
     * 相应码
     */
    private Integer code;
    /**
     * 信息
     */
    private String message;
    /**
     * 返回数据
     */
    private Object data;
}
