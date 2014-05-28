<%@ page language="java" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>Success</title>
  </head>
  <body>
    登录成功！<br>
       <div id="myinfo">
				<table>
					<tr>
						<td>用户名</td>
						<td>${sessionScope.user.userLoginname}</td>
					</tr>
					<tr>
						<td>姓名</td>
						<td>${sessionScope.user.username}</td>
					</tr>
					<tr>
						<td>身份证</td>
						<td>${sessionScope.user.identityNum}</td>
					</tr>
					<tr>
						<td>性别</td>
						<td>${sessionScope.user.gender}</td>
					</tr>
					<tr>
						<td>住址</td>
						<td>${sessionScope.user.address}</td>
					</tr>
					<tr>
						<td>联系电话</td>
						<td>${sessionScope.user.telephone}</td>
					</tr>
					<tr>
						<td>出生日期</td>
						<td>${sessionScope.user.birthday}</td>
					</tr>
            <td align="center" valign="middle"><input class= "modify" type="submit" value="修改资料" /></td>
				</table>
			</div>
    
  </body>
</html>  