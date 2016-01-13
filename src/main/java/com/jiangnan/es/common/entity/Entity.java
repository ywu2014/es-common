/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.entity;

import java.io.Serializable;

/**
 * @description 基础实体接口
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @上午9:39:08
 */
public interface Entity<ID extends Serializable> extends Serializable {
	/**
	 * 返回实体的标识属性
	 * @return
	 */
	ID getId();
	/**
	 * 判断该实体是否已存在
	 * @return
	 */
	//boolean exist();
}
