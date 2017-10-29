<%@ page import="java.io.*"%>
<%@page import="java.io.InputStreamReader"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WatchDetail</h1>
	<%
		InputStream is = request.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String eachLine = null;
		while ((eachLine = br.readLine()) != null) {
			out.println(eachLine+"<br/>");
		}
	%>
</body>
</html>