<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/public/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href=" <%=basePath%>">
<%@ include file="/WEB-INF/page/public/headInc.jsp"%>
</head>
<body class="hold-transition login-page">
	<div class="login-box">
		<div class="login-logo">
			<a><b>Hari </b>Seldon</a>
		</div>
		<div class="login-box-body">
			<p class="login-box-msg">Sign in to start your session</p>

			<form:form commandName="account">
				<div class="form-group has-feedback">
					<input name="username" type="text" class="form-control" placeholder="User Name"> 
					<span class="glyphicon glyphicon-envelope form-control-feedback"></span>
				</div>
				<div class="form-group has-feedback">
					<input name="password" type="password" class="form-control" placeholder="Password">
					<span class="glyphicon glyphicon-lock form-control-feedback"></span>
				</div>
				<div class="row">
					<div class="col-xs-8">
						<div class="checkbox icheck">
							<label> <input type="checkbox"> Remember Me</label>
						</div>
					</div>
					<!-- /.col -->
					<div class="col-xs-4">
						<button type="submit" class="btn btn-primary btn-block btn-flat">Sign In</button>
					</div>
					<!-- /.col -->
				</div>
			</form:form>
		</div>
	</div>
</body>
</html>
