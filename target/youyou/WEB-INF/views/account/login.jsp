<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="org.apache.shiro.web.filter.authc.FormAuthenticationFilter"%>
<%@ page import="org.apache.shiro.authc.ExcessiveAttemptsException"%>
<%@ page import="org.apache.shiro.authc.IncorrectCredentialsException"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>登录悠悠旅游网管理平台</title>

	<!-- The styles -->
	<link id="bs-css" href="${ctx}/static/css/bootstrap-cerulean.css" rel="stylesheet">
	<style type="text/css">
	  body {
		padding-bottom: 40px;
	  }
	  .sidebar-nav {
		padding: 9px 0;
	  }
	</style>
	<link href="${ctx}/static/css/charisma.css" rel="stylesheet">
	<link href="${ctx}/static/jquery-validation/1.11.1/validate.css" type="text/css" rel="stylesheet" />
	<!-- The fav icon -->
	<link rel="shortcut icon" href="${ctx}/static/img/favicon.ico">
</head>

<body>

<div class="container-fluid">
		<div class="row-fluid">
		
			<div class="row-fluid">
				<div class="span12 center login-header">
					<h2>欢迎登录悠悠旅游网管理平台</h2>
				</div><!--/span-->
			</div><!--/row-->
			
			<div class="row-fluid">
				<div class="well span5 center login-box">
				<%
				String error = (String) request.getAttribute(FormAuthenticationFilter.DEFAULT_ERROR_KEY_ATTRIBUTE_NAME);
				if(error != null){
				%>
					<div class="alert alert-info">
									登录信息有误，请检查后重新输入
								</div>
				<%
				}
				%>
					
					<form class="form-horizontal" action="${ctx}/admin/login" method="post">
						<fieldset>
							<div class="input-prepend" title="用户名" data-rel="tooltip">
								<span class="add-on"><i class="icon-user"></i></span><input autofocus class="input-large span10 required" name="username" id="username" type="text" value="" />
							</div>
							<div class="clearfix"></div>

							<div class="input-prepend" title="密码" data-rel="tooltip">
								<span class="add-on"><i class="icon-lock"></i></span><input class="input-large span10 required" name="password" id="password" type="password" value="" />
							</div>
							<div class="clearfix"></div>
							

							<div class="input-prepend">
							<label class="remember" for="remember"><input type="checkbox" id="rememberMe" style="width:1.5em;" /> 记住登录状态 </label>
							</div>
							<div class="clearfix"></div>

							<p class="center span5">
							<button type="submit" class="btn btn-primary">登录</button>
							</p>
						</fieldset>
					</form>
				</div><!--/span-->
			</div><!--/row-->
				</div><!--/fluid-row-->
		
	</div><!--/.fluid-container-->
	
	<script src="${ctx}/static/js/jquery-1.7.2.min.js"></script>
	<!-- jQuery UI -->
	<script src="${ctx}/static/js/jquery-ui-1.8.21.custom.min.js"></script>
	<!-- transition / effect library -->
	<script src="${ctx}/static/js/bootstrap.min.js"></script>

	<!-- library for cookie management -->
	<script src="${ctx}/static/js/jquery.cookie.js"></script>
	<script src="${ctx}/static/jquery-validation/1.11.1/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/jquery-validation/1.11.1/messages_bs_zh.js" type="text/javascript"></script>

	<script>
		$(document).ready(function() {
			$("#loginForm").validate();
		});
	</script>
</body>
</html>
