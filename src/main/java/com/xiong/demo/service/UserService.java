package com.xiong.demo.service;

import com.xiong.demo.entity.User;

/**
 * @author xiong
 * @description 用户业务接口
 */
public interface UserService {
	/**
	 * 增加用户
	 *
	 * @param user 用户对象
	 * @return 成功则返回"success"，失败则返回错误信息
	 */
	String addUser(User user);
}
