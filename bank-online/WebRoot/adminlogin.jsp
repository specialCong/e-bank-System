<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
   <title>管理员登录</title>
</head>
<body>
<center>
   <div id="adminlogin">
    <form action="adminLogin" method="post">
		用户名：
		<input type="text" name="adminName" /><br>
		密码：
		<input type="text" name="adminPwd" /><br> 
		<input type="submit" value="登录" /> 
		
		</form>
   </div>
</center>
</body>
</html>  