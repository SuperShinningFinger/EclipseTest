package com.service;

import java.util.List;
import com.entity.User;

public interface UserService {
	/**
	 * 基于ID获取指定用户
	 * @param user_name, password
	 * @return
	 */
	public User getUser(String user_name, String password);
	

	/**
	 * 查询全部管理员
	 * @return
	 */
	public List<User> listAdminUser();
}
