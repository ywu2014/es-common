/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.service;

import java.io.Serializable;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * 2015年5月4日 上午9:19:43
 */
public interface BaseService<T> {
	/**
	 * 根据标识属性获取实体
	 * @param clazz
	 * @param id
	 * @return
	 */
	T get(Class<T> clazz, Serializable id);
	/**
	 * 将实体持久化到数据库
	 * @param entity
	 * @return
	 */
	T save(T entity);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	T update(T entity);
	/**
	 * 删除实体
	 * @param clazz
	 * @param id
	 */
	void remove(Class<T> clazz, Serializable id);
	/**
	 * 实体是否存在
	 * @param clazz
	 * @param id
	 * @return
	 */
	boolean exist(Class<T> clazz, Serializable id);
}
