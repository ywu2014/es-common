/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.util;

import java.util.Locale;

import org.springframework.context.MessageSource;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * 2015年4月27日 上午11:25:34
 */
public class MessageUtils {
	
	private static MessageSource messageSource;
	
	/**
	 * 根据消息code获取对应的消息
	 * @param code 消息键
	 * @param args 参数
	 * @return
	 */
	public static String getMessage(String code, Object ...args) {
		return getMessage(code, null, null, args);
	}
	
	/**
	 * 根据消息code获取对应的消息
	 * @param code 消息键
	 * @param locale locale
	 * @param args 参数
	 * @return
	 */
	public static String getMessage(String code, Locale locale, Object ...args) {
		return getMessage(code, null, locale, args);
	}
	
	/**
	 * 根据消息code获取对应的消息
	 * @param code 消息键
	 * @param defaultMessage 默认值
	 * @param locale locale
	 * @param args 参数
	 * @return
	 */
	public static String getMessage(String code, String defaultMessage, Locale locale, Object ...args) {
		if (null == messageSource) {
			messageSource = SpringUtils.getBean(MessageSource.class);
		}
		return messageSource.getMessage(code, args, defaultMessage, locale);
	}
}
