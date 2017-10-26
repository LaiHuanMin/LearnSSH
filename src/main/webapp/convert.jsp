<%@page import="rm.rmrf.vo.User"%>
<%@page import="com.opensymphony.xwork2.util.ValueStack"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Converting tags:
	<div>
		username:
		<s:property value="splitUsername" />
	</div>
	<div>
		password:
		<s:property value="splitPassword" />
	</div>
	<div>
		User:
		<s:property value="user" />
	</div>
</body>
</html>