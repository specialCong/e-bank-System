<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
 <head>
  <title> 西部银行 </title>
  <meta name="Generator" content="EditPlus">
  <link rel="stylesheet" href="css/style.css" type="text/css"></link>
  <script src="script/jquery.min.js" type="text/javascript"></script>
  <script src="script/script.js" type="text/javascript"></script>
  <script language="javascript" type="text/javascript">
		function clearText(object,value){
		if(object.value==value)object.value="";
		}
		function resumeText(object,value){
		if(object.value=="")object.value=value;
		}
		function login(){ 
		if(form1.user.userLoginname.value==""){ 
		alert("请输入用户名！"); 
		return false; 
		} 
		if(form1.user.userPwd.value==""){ 
		alert("请输入密码！"); 
		return false; 
		} 
		if(form1.checkcode.value==""){ 
		alert("请输入验证码！"); 
		return false; 
		} 
		if(form1.checkcode.value!=document.getElementById("verifycode").innerHTML){ 
		alert("验证码不正确！"); 
		createcode();
		return false; 
		} 
		form1.submit(); 
		}
		function RandNo(){
		var code="";
		var array=new Array(0,1,2,3,4,5,6,7,8,9);
		for(var i=0;i<4;i++){
		   var index = Math.floor(Math.random()*10); 
		   code+=array[index];
		}
		document.getElementById("verifycode").innerHTML=code; 
		}
</script>
  </head>
 <body onload="RandNo();">
  <div id="container">
	<div id="header">
		<div id="banner">
			<span>网上银行服务</span>
		</div>
		<div id="nav">
			<ul>
				<li>管理员</li>
				<li class="selected">个人用户</li>
			</ul>
		</div>
	</div>
	<div id="content">
		<div id="content_top" class="selected_color"></div>
		<div id="left" class="selected_color">
			<!--个人登录-->
			<div id="login" class="left_container left_select">
				<p>欢迎使用个人网上银行</p>
				<form action="userLogin" method="post">
					<div class="field">
						<span class="label">账&nbsp;&nbsp;号：</span><input type="text" name="user.userLoginname" />
					</div>
					<div class="field">
						<span class="label">密&nbsp;&nbsp;码：</span><input type="password" name="user.userPwd" />
					</div>
					<div class="field">
						<span class="label">验证码：</span><input type="text" name="checkcode" id="check_image"/>
						<span class="check_image" id="verifycode">8888</span>
					</div>
					<div class="field">
						<input type="submit" id="submit" value="登录" class="button"/>
						<input type="reset" id="reset" value="重置" class="button"/>
					</div>
				</form>
				<div class="link"><a href="#">忘记密码？</a>|<a href="UserRegister/register.jsp">用户注册</a></div>
			</div>
			<!--企业登录-->
			<div class="left_container">
				<p>欢迎使用个人网上银行</p>
				<form action="userLogin" method="post">
					<div class="field">
						<span class="label">账&nbsp;&nbsp;号：</span><input type="text" name="user.userLoginname" />
					</div>
					<div class="field">
						<span class="label">密&nbsp;&nbsp;码：</span><input type="password" name="user.userPwd" />
					</div>
					<div class="field">
						<span class="label">验证码：</span><input type="text" name="checkcode" id="check_image"/>
						<span class="check_image" id="verifycode">8888</span>
					</div>
					<div class="field">
						<input type="submit" id="submit" value="登录" class="button"/>
						<input type="reset" id="reset" value="重置" class="button"/>
					</div>
				</form>
				<div class="link"><a href="group/lostpass.html">忘记密码？</a>|<a href="group/register.html">用户注册</a></div>
			</div>
			<!--管理员登录-->
			<div class="left_container">
				<p>管理员登陆</p>
				<form action="adminLogin" method="post">
					<div class="field">
						<span class="label">账&nbsp;&nbsp;号：</span><input type="text" name="username" id="username"/>
					</div>
					<div class="field">
						<span class="label">密&nbsp;&nbsp;码：</span><input type="password" name="password" id="password"/>
					</div>
					<div class="field">
						<span class="label">验证码：</span><input type="text" id="check_image"/><span class="check_image">adfs</span>
					</div>
					<div class="field">
						<input type="submit" id="submit" value="登录" class="button"/>
						<input type="reset" id="reset" value="重置" class="button"/>
					</div>
				</form>
				<div class="link"><a href="admin/lostpass.html">忘记密码？</a></div>
			</div>

		</div>
		<div id="right">
			
			<div id="right_bottom">
				<p>!安全提示</p>
				<ul>
					<li>&gt 请尽量使用专用电脑操作网上银行，并定期更新操作系统安全补丁和杀毒软件。
					<li>&gt 请通过西行网站访问网上银行，不要通过电子邮件，不明网站等链接登录网上银行。
					<li>&gt 请在柜台开通网银时，预留您本人的手机号码，以便为您提供重要交易短信通知、电话提醒等安全服务。
					<li>&gt 请在使用网上银行完毕后，点击页面右上角的“退出系统”，以确保安全退出。
					<li>&gt 如果您是网银盾客户，请在退出网上银行后，立即拔出您的网银盾，并安全保管好。
					<li>&gt 请不要相信来源不明的以转账汇款、中奖等为诱饵的诈骗短信。
				</ul>
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
