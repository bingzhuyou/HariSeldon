<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/taglib.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>sign up</title>  
<link rel="stylesheet" type="text/css" href="css/style.css" />  
<script type="text/javascript" src="js/calendar.js"></script>  
</head>  
<body>  
<fieldset><legend>sign up</legend><form:form  
    commandName="account">  
    <ul>  
        <li><form:label path="username">user name:</form:label><form:input  
            path="username" /></li>  
        <li><form:label path="password">password:</form:label><form:password  
            path="password" /></li>  
        <li><form:label path="phone">phone:</form:label><form:input  
            path="phone" onfocus="showDate(this);" /></li>  
        <li><form:label path="email">email:</form:label><form:input  
            path="email" /></li>  
        <li>  
        <button type="submit">regist</button>  
        <button type="reset">reset</button>  
        </li>  
    </ul>  
</form:form></fieldset>  
</body>  
</html> 