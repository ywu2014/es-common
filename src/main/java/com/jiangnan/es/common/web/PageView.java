/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.web;

import java.util.List;

import com.jiangnan.es.common.entity.query.Page;

/**
 * @description 分页显示数据,便于转换成json格式
 * @author ywu@wuxicloud.com
 * 2015年5月15日 下午10:43:53
 */
public class PageView<T> {
	
	public PageView(Page<T> page) {
		//setTotalPage(page.getTotalPage());
		//setPage(page.getCurrentPage());
		setTotal(page.getTotalRecords());
		setRows(page.getData());
	}
	/**
	 * 总页数
	 */
	private int totalPage;
	/**
	 * 当前页
	 */
	//private int page;
	/**
	 * 总记录数
	 */
	private long total;
	/**
	 * 数据
	 */
	private List<T> rows;
	
	public int getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	/*public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}*/
	public List<T> getRows() {
		return rows;
	}
	public void setRows(List<T> rows) {
		this.rows = rows;
	}
	public long getTotal() {
		return total;
	}
	public void setTotal(long total) {
		this.total = total;
	}
	
}
