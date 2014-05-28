<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
 
    
    <title>My JSP 'updateUser.jsp' starting page</title>
    
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
   
   &nbsp; This is my UpdateUser page.
		<s:form action="userUpdate">

			<table>
				
				<tr>
					<td>
						姓&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名:
					</td>
					<td>

						<s:textfield name="user.username"
							value="%{#request.map.user.username}"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>

						性&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;别:
					</td>
					<td>
						<s:textfield name="user.gender"
							value="%{#request.map.user.gender}"></s:textfield>
					</td>
				</tr>
				
				<tr>
					<td>
						出生日期:
					</td>
					<td>
						<s:textfield name="user.birthday"
							value="%{#request.map.user.birthday}"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						地&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;址:
					</td>
					<td>
						<s:textfield name="user.address"
							value="%{#request.map.user.address}"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>

						电话号码:
					</td>
					<td>
						<s:textfield name="user.telephone"
							value="%{#request.map.user.telephone}"></s:textfield>
					</td>
				</tr>
				<tr>
					<td>
						<s:submit value="确定" />
					</td>
					<td>
						<s:reset value="取消" />
					</td>
				</tr>

			</table>
		</s:form>

  </body>
</html>
