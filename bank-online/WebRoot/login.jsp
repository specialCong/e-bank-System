<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'login.jsp' starting page</title>

		<meta http-equiv="pragma" content="no-cache">
		<meta http-equiv="cache-control" content="no-cache">
		<meta http-equiv="expires" content="0">
		<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
		<meta http-equiv="description" content="This is my page">
		<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

	</head>

	<body>
		This is my Login page.
		<br>
		<s:form action="userLogin">
			<p>
				用户名&nbsp;&nbsp;&nbsp;
				<input type="text" name="user.userLoginname"
					style="background: #fff; width: 120px;" />
			</p>
			<p>
				&nbsp;密&nbsp;&nbsp;码&nbsp;&nbsp;&nbsp;
				<input type="password" name="user.userPwd"
					style="background: #fff; width: 120px;" />
			</p>
			<p>
				<s:submit value="登录" />
				&nbsp;&nbsp;
				<s:reset value="取消" />
			</p>
		</s:form>
	</body>
</html>
