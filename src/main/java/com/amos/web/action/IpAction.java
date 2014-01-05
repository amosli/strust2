package com.amos.web.action;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @ClassName: IpAction
 * @Description: TODO
 * @author: amosli
 * @email:amosli@infomorrow.com
 * @date Jan 5, 2014 4:22:06 PM
 */
public class IpAction extends ActionSupport {
	private static final long serialVersionUID = -5488264951167516910L;

	public String execute() throws Exception {
		// 获取HttpServletRequest对象和HttpServletResponse对象
		HttpServletRequest request = ServletActionContext.getRequest();
		// HttpServletResponse response = ServletActionContext.getResponse();
		// 获取servletcontext域
		// ServletContext servletContext =
		// ServletActionContext.getServletContext();

		// 获取HttpSession域　
		Map<String, Object> session = ActionContext.getContext().getSession();

		// 获取客户端ip地址
		String clientIP = request.getRemoteAddr();
		// 取得客户端的访问方式
		String method = request.getMethod();
		// response.setContentType("text/html;charset=utf-8");
		// response.getWriter().write("客户端访问的IP为：" + clientIP + "<br>");
		// response.getWriter().write("客户端的访问方式为：" + method);

		// 将信息绑定到request中
		// request.setAttribute("clientIP", clientIP);
		// request.setAttribute("method", method);

		// 将信息绑定到servletContext中
		// servletContext.setAttribute("clientIP", clientIP);
		// servletContext.setAttribute("method", method);

		// 将信息绑定到servletSession中
		session.put("clientIP", clientIP);
		session.put("method", method);

		return "toJSP";

	}
}
