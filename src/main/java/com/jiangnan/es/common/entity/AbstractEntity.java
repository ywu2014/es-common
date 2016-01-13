/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.entity;

import java.io.Serializable;

/**
 * @description 实体抽象
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @上午9:45:53
 */
public abstract class AbstractEntity<ID extends Serializable> implements Entity<ID> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2836650265971311356L;
	
}
