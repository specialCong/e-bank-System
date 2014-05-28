<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>



<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Success</title>
  </head>
  <body>
    登录成功！<br>
    <form method="post" action="userUpdate">
    <input type="hidden" name="id" value="${sessionScope.user.userId}" >
       <div id="myinfo">
				<table>
					<tr>
						<td>用户名</td>
						<td><input type="text" value="${sessionScope.user.userLoginname}" readonly/></td>
					</tr>
					<tr>
						<td>姓名</td>
						<td><input type="text" value="${sessionScope.user.username}"/></td>
					</tr>
					<tr>
						<td>身份证</td>
						<td><input type="text" value="${sessionScope.user.identityNum}"/></td>
					</tr>
					<tr>
						<td>性别</td>
						<td><input name="sex" type="radio" value="${sessionScope.user.gender}" checked="checked">男   
     <input type="radio" name="sex" value="女">女</td>
					</tr>
					<tr>
						<td>住址</td>
						<td><input type="text" value="${sessionScope.user.address}"/></td>
					</tr>
					<tr>
						<td>联系电话</td>
						<td><input type="text" value="${sessionScope.user.telephone}"/></td>
					</tr>
					<tr>
						<td>出生日期</td>
						<td><input type="text" value="${sessionScope.user.birthday}"/></td>
					</tr>
					
            <td align="center" valign="middle"><input class= "modify" type="submit" value="修改资料" /></td>
				</table>
			</div>
    </form>

  </body>
</html>  