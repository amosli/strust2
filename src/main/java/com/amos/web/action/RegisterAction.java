package com.amos.web.action;

import com.opensymphony.xwork2.ActionSupport;

/** 
* @ClassName: RegisterAction 
* @Description: TODO
* @author: amosli
* @email:amosli@infomorrow.com
* @date Jan 6, 2014 2:31:32 AM  
*/
public class RegisterAction extends ActionSupport {
	private static final long serialVersionUID = -3830387456224903276L;
	private String username;
	private String password;

	public void setUsername(String username) {
		System.out.println("调用　username方法　");
		this.username = username;
	}

	public void setPassword(String password) {
		System.out.println("调用　password方法　");
		this.password = password;
	}

	public String register() throws Exception {
		System.out.println("用户名："+username+"  密码："+password);
		return null;
	}
}
