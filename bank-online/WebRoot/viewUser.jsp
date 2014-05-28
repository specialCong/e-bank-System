<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title>My JSP 'checkCustomer.jsp' starting page</title>

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
		This is my JSP page.
		<br>
		<s:form action="viewUser">

			<table>
			<tbody>
				<tr>
					<td>
						用&nbsp;&nbsp;户&nbsp;&nbsp;名:
					</td>
					<td>
						<br>
						<s:property value="%{#request.map.user.userLoginname}"/>
						<br>
					</td>
				</tr>
				<tr>
					<td>
						身&nbsp;&nbsp;份&nbsp;&nbsp;证:
					</td>
					<td>
						<br>
						<s:property value="%{#request.map.user.identityNum}"></s:property>
						<br>
					</td>
				</tr>
				<tr>
					<td>
						姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
					</td>
					<td>

						<s:property value="%{#request.map.user.username}"></s:property>
					</td>
				</tr>
				<tr>
					<td>

						性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:
					</td>
					<td>
						<s:property value="%{#request.map.user.gender}"></s:property>
					</td>
				</tr>
				
				<tr>
					<td>
						出生日期:
					</td>
					<td>
						<s:property value="%{#request.map.user.birthday}"></s:property>
					</td>
				</tr>
				<tr>
					<td>
						地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:
					</td>
					<td>
						<s:property value="%{#request.map.user.address}"></s:property>
					</td>
				</tr>
				<tr>
					<td>

						电话号码:
					</td>
					<td>
						<s:property value="%{#request.map.user.telephone}"/>
					</td>
				</tr>
					<s:hidden name="user.identityNum"
						value="%{#request.map.user.identityNum}"></s:hidden>
					<s:submit value="修改信息"></s:submit>
				</tbody>
			</table>
		</s:form>
	</body>
</html>
