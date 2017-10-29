<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
</head>
<body>
	<h1>This is H1</h1>
	<s:tabbedPanel id="tab1" cssStyle="width:400px;height:250px;"
		doLayout="true" theme="ajax">
		<s:div id="left" theme="ajax" label="第一个Tab页" >
			What are you saying?<br/>
			What are you saying?<br/>
			What are you saying?<br/>
			What are you saying?<br/>
		</s:div>
		<s:div id="middle" theme="ajax" label="第二个Tab页" >
			HelloWorld<br/>
			HelloWorld<br/>
			HelloWorld<br/>
			HelloWorld<br/>
			HelloWorld<br/>
			HelloWorld<br/>
		</s:div>
		</s:tabbedPanel>
</body>
</html>