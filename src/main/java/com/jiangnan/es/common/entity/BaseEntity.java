/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.entity;

import java.io.Serializable;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * @description 基础实体
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @上午9:51:58
 */
public abstract class BaseEntity<ID extends Serializable> extends AbstractEntity<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6392779467053185735L;
	
	/**
	 * 版本号,有些持久化框架用于乐观锁定
	 */
	protected int version;
	/**
	 * 是否删除标记
	 */
	protected int deleted;
	/**
	 * 版本号,有些持久化框架用于乐观锁定
	 * @return
	 */
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	/**
	 * 是否删除标记,0:未删除,1:已删除
	 * @return
	 */
	public int getDeleted() {
		return deleted;
	}
	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + deleted;
		result = prime * result + version;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BaseEntity<?> other = (BaseEntity<?>) obj;
		if (deleted != other.deleted)
			return false;
		if (version != other.version)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
