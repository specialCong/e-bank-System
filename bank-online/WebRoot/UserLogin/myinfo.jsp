<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
 <head>
  <title> 西部银行 个人信息 </title>
  <meta name="Generator" content="EditPlus">
  <link rel="stylesheet" href="../css/style.css" type="text/css"></link>
  <style type="text/css">
	a.returnindex{text-decoration: none;line-height:40px;background-color:#b8e61d;height:40px;
				  font-size:18px;cursor:pointer;width:100px;text-align:center;color:#000}
	.left_container{display:block;text-align:left;}
	.left_container ul{list-style:none}
	.left_container ul li{margin:10px 0px;}
	.modify{text-align:left;padding-left:40px;display:none;width:500px; margin:10px auto;}
	#myinfo table{ width:600px; margin:20px auto;  text-align:center; font-size:14px}
	.thead1{ background:#ffff4f;}
	#myinfo table td{  border-bottom:1px solid #CCC; border-right:1px solid #CCC; height:30px;}
	.field{ width:400px; height:30px;}
	.field input{ width:200px;}
	.label{ width:100px; font-size:14px; text-align:right;}
	.field_button{ margin-left:100px;}
	.reds{ color:#F00; font-size:13px;}
  </style>
  <script src="../script/jquery.min.js" type="text/javascript"></script>
  <script type="text/javascript">
	$(document).ready(function(){
		$(".modifybutton").click(function(){
			$(".modify").show(500);
		});
	})
  </script>
 </head>
 <body>
  <div id="container">
	<div id="header">
		<div id="banner">
			<span>网上银行服务</span>
		</div>
		<div id="nav">
			<a href="index.jsp" class="returnindex">退出系统</a>
		</div>
	</div>
	<div id="content">
		<div id="content_top" class="selected_color"></div>
		<div id="left" class="selected_color">
			<!--个人注册-->
			<div class="left_container">
				<h3>用户${sessionScope.user.username}登陆成功</h3>
				<h4>您可选择以下操作</h4>
				<ul>
					<li><a href="UserLogin/myinfo.jsp">&gt 查看个人信息</a></li>
					<li><a href="#">&gt 账户查询</a></li>
					<li><a href="#">&gt 查询交易记录</a></li>
					<li><a href="#">&gt 在线支付</a></li>
					<li><a href="#">&gt 转账</a></li>
                    <li><a href="#">&gt 挂失</a></li>
				</ul>
			</div>

		</div>
		<div id="right">
			
			<div id="myinfo">
				<table>
					<tr class="thead1">
						<td>用户名</td>
						<td>真实姓名</td>
						<td>身份证号</td>
						<td>住址</td>
					</tr>
                    <tbody>
					<tr>
						<td>${sessionScope.user.userLoginname}</td>
						<td>${sessionScope.user.username}</td>
						<td>${sessionScope.user.identityNum}</td>
						<td>${sessionScope.user.address}</td>
					</tr>
                    </tbody>
				</table>
				<a href="#" class="modifybutton">密码及个人信息修改</a>
                 <div class="modify">
					<form action="userUpdate" method="post">
						<div class="field">
							<span class="label">用户名：</span><input type="text" name="username" id="username"/>
                            <label class="reds">*</label>
						</div>
						<div class="field">
							<span class="label">旧密码：</span><input type="password" name="password" id="password"/>
                            <label class="reds">*</label>
						</div>
						<div class="field">
							<span class="label">新密码：</span><input type="password" name="password" id="password"/>
                            <label class="reds">*</label>
						</div>
						<div class="field">
							<span class="label">确认新密码：</span><input type="password" name="password" id="password"/>
                            <label class="reds">*</label>
						</div>
                        <div class="field">
							<span class="label">联系电话：</span><input type="text" name="phone" id="phone"/>
                            <label class="reds">*</label>
						</div>
						 <div class="field">
							<span class="label">住址：</span><input type="text" name="address" id="address"/>
                            <label class="reds">*</label>
						</div>
						<div class="field">
							<span class="label">出生日期：</span><input type="text" name="birthday" id="birthday"/>
                            <label class="reds">*</label>
						</div>
                        <br />
                         <div class="reds" style="margin-left:60px;">（温馨提示：带*号的是必填项）</div><br />
						<div class="field_button">
							<input type="submit" id="submit" value="提交" class="button"/>
                            &nbsp;&nbsp;&nbsp;
							<input type="reset" id="reset" value="重置" class="button"/>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<div id="footer">
		<pre>@西部银行版权所有</pre>
		<pre>E-mail：110@wb.com    24小时服务热线110</pre>
	</div>
  </div>
 </body>
</html>

