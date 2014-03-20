<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
<title>欢迎主页</title>

</head>
<body>
	<div class="jumbotron">
		<div class="container">
	 	 <h1><shiro:principal property="name"/>,欢迎</h1>
	 	 <p>您登录悠悠旅游网管理系统</p>
	  </div>
	</div>
	 <script type="text/javascript">
	 <!--js报错-->
     	function doBodyInit(){
     		
     	}
     </script>
</body>
</html>