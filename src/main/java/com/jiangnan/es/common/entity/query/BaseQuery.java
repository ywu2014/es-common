/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.entity.query;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @下午4:06:53
 */
public abstract class BaseQuery implements Query {
	/**
	 * 查询参数
	 */
	protected Map<String, Object> parameters = new HashMap<String, Object>();

	public Map<String, Object> getParameters() {
		return Collections.unmodifiableMap(parameters);
	}

	public void addParameter(String name, Object value) {
		this.parameters.put(name, value);
	}

	public Map<String, Object> getMergedParameters() {
		return Collections.unmodifiableMap(parameters);
	}
}
