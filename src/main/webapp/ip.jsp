<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<%
	String method=request.getAttribute("method").toString();
	String clientIP=request.getAttribute("clientIP").toString();
	%>
	客户端IP是:<%=clientIP %><br/>
	客户端的访问方式为：<%=method %><br><hr> --%>
	
<%-- 	<%
	String method=application.getAttribute("method").toString();
	String clientIP=application.getAttribute("clientIP").toString();
	%>
	客户端IP是:<%=clientIP %><br/>
	客户端的访问方式为：<%=method %><br><hr>
	[客户端访问的IP为]：${applicationScope.clientIP }<br>
    [客户端的访问方式为]：${applicationScope.method}<br> --%>
    
    
    	<%
	String method=session.getAttribute("method").toString();
	String clientIP=session.getAttribute("clientIP").toString();
	%>
	客户端IP是:<%=clientIP %><br/>
	客户端的访问方式为：<%=method %><br><hr>
	[[客户端访问的IP为]]：${sessionScope.clientIP }<br>
    [[客户端的访问方式为]]：${sessionScope.method}<br>
    
</body>
</html>