package com.amos.web.action;

import com.opensymphony.xwork2.ActionSupport;

//struts2的控制器 
public class HelloWorldAction extends ActionSupport{
	private static final long serialVersionUID = 6872366878758961847L;
	
	public HelloWorldAction(){
		System.out.println("hello actions:"+this.hashCode());
	}
	//重写execute()方法
	public String execute() throws Exception {
		System.out.println("欢迎使用struts2!");
		return "success";
	}
	
}
