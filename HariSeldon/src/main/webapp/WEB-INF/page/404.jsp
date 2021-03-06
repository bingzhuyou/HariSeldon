<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/page/public/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<base href=" <%=basePath%>">
<%@ include file="/WEB-INF/page/public/headInc.jsp"%>
</head>
<body  class="hold-transition skin-blue sidebar-mini">
<!-- Content Wrapper. Contains page content -->
	<div class="content-wrapper">
		<!-- Content Header (Page header) -->
		<section class="content-header">
			<h1>404 Error Page</h1>
			<ol class="breadcrumb">
				<li><a href="#"><i class="fa fa-dashboard"></i> Home</a></li>
				<li><a href="#">Examples</a></li>
				<li class="active">404 error</li>
			</ol>
		</section>

		<!-- Main content -->
		<section class="content">
			<div class="error-page">
				<h2 class="headline text-yellow">404</h2>

				<div class="error-content">
					<h3>
						<i class="fa fa-warning text-yellow"></i> Oops! Page not found.
					</h3>
					<p>
						We could not find the page you were looking for. Meanwhile, you
						may <a href="../../index.html">return to dashboard</a> or try
						using the search form.
					</p>
				</div>
				<!-- /.error-content -->
			</div>
			<!-- /.error-page -->
		</section>
		<!-- /.content -->
	</div>
</body>
</html>
