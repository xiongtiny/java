package com.xiong.demo.exception;

import lombok.Getter;

/**
 * @author xiong
 * @description 自定义异常
 */
@Getter //只要getter方法，无需setter
public class ApiException extends RuntimeException {

	private int code;
	private String msg;

	public ApiException() {
		this(1001, "接口错误");
	}

	public ApiException(String msg) {
		this(1001, msg);
	}

	public ApiException(int code, String msg) {
		super(msg);
		this.code = code;
		this.msg = msg;
	}
}
