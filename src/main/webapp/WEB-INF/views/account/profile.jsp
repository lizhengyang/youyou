<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>资料修改</title>
</head>

<body>
  <div class="container" style = "width:100%;margin:auto">
	<form id="inputForm" action="${ctx}/admin/profile" method="post" class="form-horizontal">
		<input type="hidden" name="id" value="${user.id}"/>
		<fieldset>
			<legend><small>资料修改</small></legend>
			<div class="row"  style="width:60%; margin:0 auto;">
				<div class="control-group">
					<label for="name" class="control-label">用户名:</label>
					<div class="controls">
						<input type="text" id="name" name="username" value="${user.username}" class="input-large required"/>
					</div>
				</div>
				
				<div class="control-group">
					<input name="id" value="${user.id}" style="display:none">
					<label for="plainPassword" class="control-label">密码:</label>
					<div class="controls">
						<input type="password" id="plainPassword" name="plainPassword" class="input-large" placeholder=""/>
					</div>
				</div>
				<div class="control-group">
					<label for="confirmPassword" class="control-label">确认密码:</label>
					<div class="controls">
						<input type="password" id="confirmPassword" name="confirmPassword" class="input-large" equalTo="#plainPassword" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<div class="row"  style="width:45%; margin:0 auto;">
					<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
					<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
				</div>
			</div>
		</fieldset>
	</form>
	</div>
	<script>
			function doBodyInit(){
				//聚焦第一个输入框
				$("#name").focus();
				//为inputForm注册validate函数
				$("#inputForm").validate({
					rules:{
						name:{
							required: true
						},
						plainPassword:{
							required: true,
						    minlength: 5
						},
						confirmPassword:{
							required: true,
						    minlength: 5,
						    equalTo: "#plainPassword"
						}					
					}
				});
	     	}
	</script>
</body>
</html>
