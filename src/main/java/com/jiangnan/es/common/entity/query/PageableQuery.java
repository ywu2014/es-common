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
 * @2015年4月23日 @下午4:14:44
 */
public class PageableQuery extends BaseQuery {
	private static final String FIRST_RESULT_QUERY_PARAM_NAME = "firstResult";
	private static final String MAX_RESULT_QUERY_PARAM_NAME = "maxResults";
	
	/**
	 * 排序字段
	 */
	private Map<String, String> orderBy = new HashMap<String, String>(1);
	/**
	 * 开始索引
	 */
	protected Integer firstResult;
	/**
	 * 最大记录数
	 */
	protected Integer maxResults;
	
	public Map<String, String> getOrderBy() {
		return Collections.unmodifiableMap(orderBy);
	}
	/**
	 * 添加排序字段
	 * @param column 排序字段
	 * @param orderBy 排序方式,asc | desc
	 */
	public void addOrderBy(String column, String orderBy) {
		this.orderBy.put(column, orderBy);
	}
	/**
	 * 获取开始索引
	 * @return
	 */
	public Integer getFirstResult() {
		return firstResult;
	}
	/**
	 * 设置开始索引
	 * @param firstResult
	 */
	public void setFirstResult(Integer firstResult) {
		this.firstResult = firstResult;
	}
	/**
	 * 获取最大记录数
	 * @return
	 */
	public Integer getMaxResults() {
		return maxResults;
	}
	/**
	 * 设置最大记录数
	 * @param maxResults
	 */
	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}
	
	@Override
	public Map<String, Object> getMergedParameters() {
		Map<String, Object> mergedParameters = new HashMap<String, Object>();
		
		if (!super.getMergedParameters().isEmpty()) {
			mergedParameters.putAll(super.getMergedParameters());
		}
		if (!orderBy.isEmpty()) {
			mergedParameters.putAll(orderBy);
		}
		if (null != firstResult) {
			mergedParameters.put(FIRST_RESULT_QUERY_PARAM_NAME, firstResult);
		}
		if (null != maxResults) {
			mergedParameters.put(MAX_RESULT_QUERY_PARAM_NAME, maxResults);
		}
		return mergedParameters;
	}
}
