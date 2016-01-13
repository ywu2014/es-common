/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.exception;

/**
 * @description 非业务相关异常
 * @author ywu@wuxicloud.com
 * 2015年4月27日 下午1:16:54
 */
public class SystemException extends BaseException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6926846047169577913L;

	/**
	 * @param code
	 * @param defaultMessage
	 * @param args
	 */
	public SystemException(String code, String defaultMessage, Object[] args) {
		super(code, defaultMessage, args);
	}

	public SystemException(Throwable cause) {
		super(cause);
	}
}
