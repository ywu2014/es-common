/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.web.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;

import com.jiangnan.es.common.web.AjaxResult;
import com.jiangnan.es.util.JsonUtils;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * 2015年4月27日 下午2:14:41
 */
public abstract class BaseController {
	
	private static final String RESPONSE_TYPE_JSON = "application/json";
	
	/**
	 * 重定向
	 * @param logicView
	 * @return
	 */
	protected String redirect(String logicView) {
		return "redirect:" + logicView;
	}
	
	/**
	 * ajax操作返回结果信息
	 * @param status 状态,0:成功,1:失败
	 * @param msgCode 消息代码
	 * @param args 生成消息的参数
	 * @return
	 */
	protected AjaxResult ajaxResult(int status, String msgCode, Object... args) {
		AjaxResult ajaxResult = new AjaxResult(status);
		ajaxResult.setMsgCode(msgCode, args);
		return ajaxResult;
	}
	
	/**
	 * ajax操作返回结果信息
	 * @param status 状态,0:成功,1:失败
	 * @param msg 提示消息
	 * @return
	 */
	protected AjaxResult ajaxResult(int status, String msg) {
		return new AjaxResult(status, msg);
	}
	
	/**
	 * json数据返回
	 * @param response
	 * @param obj
	 */
	protected void jsonResponse(HttpServletResponse response, Object obj) {
		response.setContentType(RESPONSE_TYPE_JSON);
		PrintWriter pw = null;
		try {
			pw = response.getWriter();
			pw.write(JsonUtils.object2JsonString(obj));
			pw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != pw) {
				pw.close();
			}
		}
	}
	
	/**
	 * 新增action
	 * @param model
	 */
	protected void addAction(Model model) {
		model.addAttribute("action", "add");
	}
	
	/**
	 * 更新action
	 * @param model
	 */
	protected void updateAction(Model model) {
		model.addAttribute("action", "update");
	}
}
