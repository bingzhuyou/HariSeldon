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
<fieldset><legend>user info</legend>  
<ul>  
    <li><label>id:</label><c:out value="${account.id}" /></li>  
    <li><label>username:</label><c:out value="${account.username}" /></li>  
    <li><label>phone:</label><c:out value="${account.phone}" /></li>  
    <li><label>email:</label><c:out value="${account.email}" /></li>  
</ul>  
</fieldset> 
</body>  
</html> 