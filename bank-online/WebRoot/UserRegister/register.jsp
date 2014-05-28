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
  <script language="JavaScript" type="text/javascript">
	function checkUser() {
		var un = document.user.userLoginname.value;
		alert(un);
		var pw = document.user.userPwd.value;
		var pw2 = document.user.userPwd2.value;
		var un2 = document.user.username.value;
		var s1 = document.user.street1.value;
		var s2 = document.user.street2.value;
		var city = document.user.city.value;
		var zip = document.user.zip.value;
		var email = document.user.email.value;
		var hp = document.user.homephone.value;
		var cp = document.user.cellphone.value;
		var op = document.user.officephone.value;
		var pat = new RegExp("[^a-zA-Z0-9\_\u4e00-\u9fa5]", "i");
		var em = new RegExp("^([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\_|\.]?)*[a-zA-Z0-9]+\\.[a-zA-Z]{2,3}$","gi");
		var zc= new RegExp("^[1-9][0-9]{5}$");
		var hpn=new RegExp("^ \\d{3}-\\d{7,8}|\\d{4}-\\d{7,8}$");
		var cpn=new RegExp("^(13[0-9]|15[0-9]|18[7-9])[0-9]{8}$");
		var opn=new RegExp("^ \\d{3}-\\d{7,8}|\\d{4}-\\d{7,8}$");
		if (un == "" || pw == "") {
			alert("用户名或者密码不能为空");
			document.user.userLoginname.focus();
			return false;
		} else if (pw2 != pw) {
			alert("两次输入的密码必须相同");
			document.user.userPwd.value = "";
			document.user.userPwd2.focus();
			return false;
		} else if (un2 == "" || pat.test(un2) == true) {
			alert("真实姓名为空或者含有非法字符");
			document.user.username.focus();
			return false;
		} else if (pat.test(un) == true || pat.test(pw) == true) {
			alert('用户名或者密码含有非法字符');
			document.userinfo.username.focus();
			return false;
		} else if (s1 == "") {
			alert('至少需要填一个地址');
			document.userinfo.street1.focus();
			return false;
		} else if (city == "" || pat.test(city) == true) {
			alert('城市为空或者格式错误');
			document.userinfo.city.value = "";
			document.userinfo.city.focus();
			return false;
					} else if (zip == "" || zc.test(zip) == false) {
			alert('邮编为空或者格式错误');
			document.userinfo.zip.value = "";
			document.userinfo.zip.focus();
			return false;
		} else if (email == "" || em.test(email) == false) {
			alert('E-mail为空或者格式错误');
			document.userinfo.email.value = "";
			document.userinfo.email.focus();
			return false;

			} else if (hp != "") {if (hpn.test(hp) ==false) {
			alert('住宅电话格式错误');
			document.userinfo.homephone.value = "";
			document.userinfo.homephone.focus();
			return false;}
			} else if (cp == "" || cpn.test(cp) == false) {
			alert('移动电话为空或者格式错误');
			document.userinfo.cellphone.value = "";
			document.userinfo.cellphone.focus();
			return false;
			} else if(op != "") { if(opn.test(op) == false) {
			alert('办公电话格式错误');
			document.userinfo.officephone.value = "";
			document.userinfo.officephone.focus();
			return false;}
		} else {
			alert('注册成功');
			document.user.submit();
			
		}
	}
</script>
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
                <form action="userRegist" method="post">
        <table width="320" border="0" align="center" cellspacing="10">
          <tr>
            <th width="100" align="center" valign="middle" scope="row">用户名:</th>
            <td width="186" align="left" valign="middle"><input name="user.userLoginname" type="text" size="20" maxlength="32" id="username" onkeypress="if(event.keyCode == 13) user.userLoginname.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">密码:</th>
            <td align="left" valign="middle"><input name="user.userPwd" type="password" id="password" size="22" maxlength="16" onkeypress="if(event.keyCode == 13) user.userPwd.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">重复密码:</th>
            <td align="left" valign="middle"><input name="password2" type="password" id="password2" size="22" maxlength="16" onkeypress="if(event.keyCode == 13) user.userPwd.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">身份证号:</th>
            <td align="left" valign="middle"><input name="user.identityNum" type="text" id="identityNum" size="20" maxlength="18" onkeypress="if(event.keyCode == 18) user.identityNum.focus();" />
              <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">真实姓名:</th>
            <td align="left" valign="middle"><input name="user.username" type="text" size="20" maxlength="32" id="username2" onkeypress="if(event.keyCode == 13) user.username2.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">性别:</th>
            <td align="left" valign="middle"><input name="user.gender" type="radio" value="男" checked="checked">男   
     <input type="radio" name="user.gender" value="女">女</td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">地址:</th>
            <td align="left" valign="middle"><input name="user.address" type="text" id="street1" size="20" maxlength="64" onkeypress="if(event.keyCode == 13) user.address.focus();" /></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">联系电话:</th>
            <td align="left" valign="middle"><input name="user.telephone" type="text" id="telephone" size="20" maxlength="11" onkeypress="if(event.keyCode == 13) user.telephone.focus();" /></td>
          </tr>
 		  <tr>
            <th align="center" valign="middle" scope="row">出生日期:</th>
            <td align="left" valign="middle"><input name="user.birthday" type="text" id="birthday" size="20" maxlength="32" onkeypress="if(event.keyCode == 13) user.birthday.focus();" /></td>
          </tr>
        </table>
        <p></p>
        <table width="260" border="0" align="center">
          <div class="reds">（温馨提示：带*号的是必填项）</div><br />
          <tr>
            <td align="center" valign="middle"><input class= "register" type="submit" value="提交" onclick="checkUser()"/></td>
            <td align="center" valign="middle"><input class= "register" type="reset" value="重填" /></td>
          </tr>
        </table>
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

