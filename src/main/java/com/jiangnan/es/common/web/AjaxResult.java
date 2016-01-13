/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.web;

import com.jiangnan.es.common.util.MessageUtils;
import com.jiangnan.es.util.StringUtils;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * 2015年5月27日 下午2:30:50
 */
public class AjaxResult {
	private static final String DEFAULT_MSG = "操作成功";
	/**
	 * 操作状态,0:成功,1:失败
	 */
	private int status = 0;
	/**
	 * 提示信息
	 */
	private String msg = DEFAULT_MSG;
	
	public AjaxResult(int status) {
		this.status = status;
	}
	
	public AjaxResult(int status, String msg) {
		this.status = status;
		this.msg = msg;
	}
	
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	/**
	 * 设置提示信息的代号
	 * @param code 提示信息代号
	 * @param args 提示信息参数
	 */
	public void setMsgCode(String code, Object... args) {
		if (StringUtils.hasLength(code)) {
			setMsg(MessageUtils.getMessage(code, args));;
		}
	}
}
