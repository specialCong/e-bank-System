<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.0 Transitional//EN">
<html>
 <head>
  <title> 西部银行 个人用户注册 </title>
  <meta name="Generator" content="EditPlus">
  <link rel="stylesheet" href="../css/style.css" type="text/css"></link>
  <style type="text/css">
	a.returnindex{text-decoration: none;line-height:40px;background-color:#b8e61d;height:40px;
				  font-size:18px;cursor:pointer;width:100px;text-align:center;color:#000}
    .regist_form{ width:400px; height:400px; margin-left:150px; margin-top:10px;}
	.regist_info{ height:28px;}
	.regist_info label{ width:80px; font-size:13px;}
    .regist_info input{ width:200px;}
	.buttons{ width:60px;}
	.reds{ color:#F00; font-size:13px;}
	#tishi_info{width:250px; margin-left:20px;}
	#tishi_info table{font-size:13px;color:#333;}
  </style>
  <script src="../script/jquery.min.js" type="text/javascript"></script>
  <script src="../script/script.js" type="text/javascript"></script>
 </head>
 <body>
  <div id="container">
	<div id="header">
		<div id="banner">
			<span>网上银行服务</span>
		</div>
		<div id="nav">
			<a href="../index.jsp" class="returnindex">返回首页</a>
		</div>
	</div>
	<div id="content">
		<div id="content_top" class="selected_color"></div>
		<div id="left" class="selected_color">
			<!--个人注册-->
			<div class="left_container left_select">
             <div id="tishi_info">
			  <p>!注册说明</p>
              <table border="0">
                <tr><td>&gt 请填写真实资料。</td></tr>
                <tr><td>&gt 自助注册个人网上银行时只能注册一张卡。</td></tr>
                <tr><td>&gt 为了保障您账户资金的安全，请设置强度高的密码。</td></tr>
                <tr><td>&gt 请在填写完注册信息时，点击“提交按钮”。</td></tr>
              </table>
			</div>
           </div>

		</div>
		<div id="right">
			<!--注册信息-->
	    <div id="right_bottom">
             <br />
            <div class="regist_form">
                <form action="personal/registesuccess.html" method="post" >
                  <div style="margin-left:100px;"><h3>注册信息</h3></div>
                  <div class="regist_info"><label>登录账户： </label> <input type="text" name="username" id="username"></input>
                  <label class="reds">*</label>
                  </div>
                  <div class="regist_info"><label>用户姓名：</label> <input type="text" name="username" id="username"></input>
                  <label class="reds">*</label>
                  </div>
                  <div class="regist_info"><label>身份证号：</label> <input type="text" name="userid" id="userid"></input>
                  <label class="reds">*</label>
                  </div>
                  <div class="regist_info"><label>银行卡号：</label> <input type="text" name="bankid" id="bankid"></input>
                  <label class="reds">*</label>
                  </div>
                  <div class="regist_info"><label>登录密码：</label> <input type="password" name="password" id="password"></input>
                  <label class="reds">*</label>
                  </div>
                  <div class="regist_info"><label>确认密码：</label> <input type="password" name="password" id="password"></input>
                  <label class="reds">*</label>
                  </div>
                  
                  <div class="regist_info"><label>联系电话：</label> <input type="text" name="phone" id="phone"></input>
                  </div>
                  <div class="regist_info"><label>工作单位：</label> <input type="text" name="company" id="company">
                  </div>
                  <div class="regist_info"><label>家庭住址：</label> <input type="text" name="address" id="address"></input>
                  </div>
                  <br />
                  <div style=" margin-left:80px;">    
                  <div class="reds">（温馨提示：带*号的是必填项）</div><br />
                  <input type="submit" value="提交" class="buttons"></input>
                  <input type="reset" value="重置" class="buttons"></input>    
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
