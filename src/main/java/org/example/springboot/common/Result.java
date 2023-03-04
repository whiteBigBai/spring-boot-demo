package org.example.springboot.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author bailiang
 */
@Data
@NoArgsConstructor
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
