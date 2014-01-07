package com.amos.web.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: UserAction
 * @Description: 用户管理，将相关的action封装到一个类中
 * @author: amosli
 * @email:amosli@infomorrow.com
 * @date Jan 8, 2014 1:06:00 AM
 */
public class UserAction extends ActionSupport {
	private static final long serialVersionUID = -6275534406709255984L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// 用户注册
	public String register() throws Exception {

		return "toRegisterJsp";
	}

	// 用户登录
	public String login() throws Exception {
		return "toLoginJsp";
	}

}
