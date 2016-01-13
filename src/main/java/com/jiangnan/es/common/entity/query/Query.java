/**
 * Copyright (c) 2015-2015 yejunwu126@126.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.jiangnan.es.common.entity.query;

import java.util.Map;


/**
 * @description TODO
 * @author ywu@wuxicloud.com
 * @2015年4月23日 @下午5:12:50
 */
public interface Query {
	/**
	 * 获取合并后的参数
	 * @return
	 */
	Map<String, Object> getMergedParameters();
}
