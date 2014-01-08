<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="/struts-tags"  prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- /struts2/UserRegister -->
	
	<s:form name="user_register" action="/UserRegister" method="POST">
		<s:textfield  label="用户名" name="username"/>
		<s:password label="密码" name="password"/>
		<s:submit label="提交"/>
	
	</s:form>
</body>
</html>