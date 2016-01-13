/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.service.impl;

import java.io.Serializable;

import com.jiangnan.es.common.repository.BaseRepository;
import com.jiangnan.es.common.service.BaseService;

/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * 2015年4月27日 下午1:20:18
 */
public abstract class BaseServiceSupport<T> implements BaseService<T> {
	/**
	 * 将实体持久化到数据库
	 * @param entity
	 * @return
	 */
	public T save(T entity) {
		getRepository().save(entity);
		return entity;
	}
	/**
	 * 删除实体
	 * @param clazz
	 * @param id
	 */
	public void remove(Class<T> clazz,Serializable id) {
		getRepository().remove(clazz, id);
	}
	/**
	 * 实体是否存在
	 * @param clazz
	 * @param id
	 * @return
	 */
	public boolean exist(Class<T> clazz, Serializable id) {
		return getRepository().exist(clazz, id);
	}
	/**
	 * 根据标识属性获取实体
	 * @param clazz
	 * @param id
	 * @return
	 */
	public T get(Class<T> clazz, Serializable id) {
		return getRepository().get(clazz, id);
	}
	/**
	 * 更新实体
	 * @param entity
	 * @return
	 */
	public T update(T entity) {
		getRepository().update(entity);
		return entity;
	}
	
	/**
	 * 设置工厂
	 */
	protected abstract BaseRepository<T> getRepository();
}
