package com.pignest.api_client_sdk.exception;


import com.pignest.api_client_sdk.constant.ErrorCode;
import lombok.Getter;

import java.io.Serial;

/**
 * 自定义异常类
 *
 * @author Black

 */
@Getter
public class BusinessException extends RuntimeException {

    @Serial
    private static final long serialVersionUID = 111467553216269257L;
    /**
     * 错误码
     */
    private final int code;

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String message) {
        super(message);
        this.code = errorCode.getCode();
    }

}
