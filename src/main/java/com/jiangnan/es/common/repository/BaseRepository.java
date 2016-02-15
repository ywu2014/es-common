/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.repository;

import java.io.Serializable;
import java.util.List;

/**
 * @description 基础仓储接口
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @上午10:29:12
 */
public interface BaseRepository<T> {
	/**
	 * 将实体持久化到数据库
	 * @param entity
	 * @return
	 */
	int save(T entity);
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
	/**
	 * 根据标识属性获取实体
	 * @param clazz
	 * @param id
	 * @return
	 */
	T get(Class<T> clazz, Serializable id);
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	int update(T entity);
	/**
	 * 获取列表
	 * @param params
	 * @return
	 */
	<E> List<E> list(T params);
}
