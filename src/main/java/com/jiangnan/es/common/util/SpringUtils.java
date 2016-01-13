/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description spring 工具类
 * @author ywu@wuxicloud.com
 * 2015年4月27日 上午11:25:20
 */
public final class SpringUtils implements ApplicationContextAware {
	
	private SpringUtils() {}

	private static ApplicationContext context = null;
	
	public void setApplicationContext(ApplicationContext applicationContext)
			throws BeansException {
		context = applicationContext;
	}
	/**
	 * 根据bean的id获取bean
	 * @param beanId
	 * @return
	 */
	public static Object getBean(String beanId){
		return context.getBean(beanId);
	}
	
	/**
	 * 根据指定类型获取bean
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(Class<T> clazz){
		return context.getBean(clazz);
	}
	
	/**
	 * 根据bean的id获取bean,并转换成clazz对应的类型
	 * @param beanId
	 * @param clazz
	 * @return
	 */
	public static <T> T getBean(String beanId, Class<T> clazz){
		return context.getBean(beanId, clazz);
	}
}
