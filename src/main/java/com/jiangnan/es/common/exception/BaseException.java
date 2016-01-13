/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.exception;

import com.jiangnan.es.common.util.MessageUtils;
import com.jiangnan.es.util.StringUtils;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * @2015年4月27日 @上午11:06:28
 */
public class BaseException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6328696065275715259L;
	
	/**
	 * 消息代号
	 */
	private String code;
	/**
	 * 默认消息
	 */
	private String defaultMessage;
	/**
	 * 参数
	 */
	private Object[] args;
	
	public BaseException(String code, String defaultMessage, Object[] args) {
		this.code = code;
		this.defaultMessage = defaultMessage;
		this.args = args;
	}
	
	public BaseException(Throwable cause) {
		super(cause);
		if (cause instanceof BaseException) {
			BaseException e = (BaseException)cause;
			this.code = e.getCode();
			this.defaultMessage = e.getDefaultMessage();
			this.args = e.getArgs();
		}
	}
	
	@Override
	public String getMessage() {
		String message = null;
		if (!StringUtils.isEmpty(code)) {
			message = MessageUtils.getMessage(code, args);
		}
		if (null == message) {
			message = defaultMessage;
		}
		return message;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getDefaultMessage() {
		return defaultMessage;
	}

	public void setDefaultMessage(String defaultMessage) {
		this.defaultMessage = defaultMessage;
	}

	public Object[] getArgs() {
		return args;
	}

	public void setArgs(Object[] args) {
		this.args = args;
	}
	
}
