<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Account</title>
</head>
<body>
	<fieldset>
		<legend>login</legend>
		<form:form commandName="account">
			<form:hidden path="id" />
			<ul>
				<li><form:label path="username">username:</form:label> <form:input
						path="username" /></li>
				<li><form:label path="password">password:</form:label> <form:password
						path="password" /></li>
				<li>
					<button type="submit">login</button>
					<button type="reset">reset</button>
				</li>
			</ul>
		</form:form>
	</fieldset>
</body>
</html>
