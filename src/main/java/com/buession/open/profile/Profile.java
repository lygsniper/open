/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 
 * (the "License"); you may not use this file except in compliance with the License. You may obtain 
 * a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 * 
 * =================================================================================================
 * 
 * This software consists of voluntary contributions made by many individuals on behalf of the
 * Apache Software Foundation. For more information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 * 
 * +------------------------------------------------------------------------------------------------+
 * | License: http://open.buession.com.cn/LICENSE 													|
 * | Author: Yong.Teng <webmaster@buession.com> 													|
 * | Copyright @ 2013-2014 Buession.com Inc.														|
 * +------------------------------------------------------------------------------------------------+
 */
package com.buession.open.profile;

import java.util.Locale;
import java.util.Map;

/**
 * 用户 Profile
 * 
 * @author Yong.Teng <webmaster@buession.com>
 */
public interface Profile {

	/**
	 * 返回用户名
	 * 
	 * @return 用户名
	 */
	public String getUsername();

	/**
	 * 返回用户 E-mail
	 * 
	 * @return 用户 E-mail
	 */
	public String getEmail();

	/**
	 * 返回用户名字
	 * 
	 * @return 用户名字
	 */
	public String getFirstName();

	/**
	 * 返回用户姓氏
	 * 
	 * @return 用户姓氏
	 */
	public String getFamilyName();

	/**
	 * 返回用户真实姓名
	 * 
	 * @return 用户真实姓名
	 */
	public String getRealName();

	/**
	 * 返回用户显示名称
	 * 
	 * @return 用户显示名称
	 */
	public String getDisplayName();

	/**
	 * 返回用户性别
	 * 
	 * @return 用户性别
	 */
	public Object getGender();

	/**
	 * 返回用户头像地址
	 * 
	 * @return 用户头像地址
	 */
	public String getAvatar();

	/**
	 * 返回用户头像地址
	 * 
	 * @return 用户头像地址
	 */
	public String getPictureUrl();

	/**
	 * 返回用户资料页地址
	 * 
	 * @return 用户资料页地址
	 */
	public String getProfileUrl();

	/**
	 * 返回用户 Local
	 * 
	 * @return 用户 Local
	 */
	public Locale getLocale();

	/**
	 * 返回用户国家
	 * 
	 * @return 用户国家
	 */
	public String getCountry();

	/**
	 * 返回用户省份
	 * 
	 * @return 用户省份
	 */
	public String getProvince();

	/**
	 * 返回用户城市
	 * 
	 * @return 用户城市
	 */
	public String getCity();

	/**
	 * 返回用户联系地址
	 * 
	 * @return 用户联系地址
	 */
	public String getAddress();

	/**
	 * 返回用户联系地址
	 * 
	 * @return 用户联系地址
	 */
	public String getLocation();

	/**
	 * 返回用户是否是 VIP 用户
	 * 
	 * @return 用户是否是 VIP 用户
	 */
	public boolean getIsVip();

	/**
	 * 添加 Profile 属性
	 * 
	 * @param name
	 *        属性名称
	 * @param value
	 *        属性值
	 */
	public void addAttribute(final String name, Object value);

	/**
	 * 批量添加 Profile 属性
	 * 
	 * @param attributes
	 *        属性列表
	 */
	public void addAttributes(final Map<String, Object> attributes);

	/**
	 * 返回 Profile 属性
	 * 
	 * @param name
	 *        属性名称
	 * @return Profile 属性
	 */
	public Object getAttribute(final String name);

	/**
	 * 返回 Profile 所有属性
	 * 
	 * @return Profile 所有属性
	 */
	public Map<String, Object> getAttributes();

}