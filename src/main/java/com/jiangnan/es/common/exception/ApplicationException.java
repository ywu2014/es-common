/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.exception;

/**
 * @description 业务相关异常
 * @author ywu@wuxicloud.com
 * 2015年4月27日 下午1:14:42
 */
public class ApplicationException extends BaseException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3265165653728067841L;

	/**
	 * @param code
	 * @param defaultMessage
	 * @param args
	 */
	public ApplicationException(String code, String defaultMessage,
			Object[] args) {
		super(code, defaultMessage, args);
	}
	
	public ApplicationException(Throwable cause) {
		super(cause);
	}
}
