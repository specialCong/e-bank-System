<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'delUser.jsp' starting page</title>
    
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
   <div id="myinfo">
				<table>
					<tr class="tdead1">
						<td>用户名</td>
						<td>真实姓名</td>
						<td>身份证号</td>
						<td>用户余额/元</td>
						<td>冻结账户</td>
                        <td>删除账户</td>
					</tr>
					<tr>
						<td>jerry</td>
						<td>张宁</td>
						<td>1234567890</td>
						<td>3000</td>
						<td><a href="#">冻结</a></td>
                        <td><a href="adminAction">删除</a></td>
					</tr>
					<tr>
						<td>jerry</td>
						<td>张宁</td>
						<td>1234567890</td>
						<td>3000</td>
						<td><a href="#">冻结</a></td>
                        <td><a href="#">删除</a></td>
					</tr>
					<tr>
						<td>jerry</td>
						<td>张宁</td>
						<td>1234567890</td>
						<td>3000</td>
						<td><a href="#">冻结</a></td>
                        <td><a href="#">删除</a></td>
					</tr>
				</table>
			</div>
  </body>
</html>
