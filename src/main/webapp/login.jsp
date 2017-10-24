<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<s:head theme="ajax" /> 
</head> 
<body> 
	<h1>Welcome to login</h1>  
	<s:form action="Login.action" method="POST">
		<s:textfield label="用户" name="username" />
		<s:textfield label="密码" name="password" />
		<s:datetimepicker name="date" toggleType="explode"
			displayFormat="yyyy-MM-dd" id="date" value="today" label="时间"></s:datetimepicker>
		<s:submit value="提交" />
	</s:form>
	<s:text name="当前登陆次数">
	</s:text>
	${sessionScope.loginTimes}
</body>
</html>