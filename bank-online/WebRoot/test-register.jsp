<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
<div class="register">
       	
            
                <div class="form_subtitle">创建新用户</div>
		<table  align="center">
		<tr>
		<td>${errorMessage }</td>
		</tr>
		</table> 
           <form action="userRegist" method="post">
        <table width="320" border="0" align="center" cellspacing="10">
          <tr>
            <th width="100" align="center" valign="middle" scope="row">用户名:</th>
            <td width="186" align="left" valign="middle"><input name="user.userLoginname" type="text" size="20" maxlength="32" id="username" onkeypress="if(event.keyCode == 13) user.userPwd.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">密码:</th>
            <td align="left" valign="middle"><input name="user.userPwd" type="password" id="password" size="20" maxlength="16" onkeypress="if(event.keyCode == 13) user.userPwd.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">重复密码:</th>
            <td align="left" valign="middle"><input name="password2" type="password" id="password2" size="20" maxlength="16" onkeypress="if(event.keyCode == 13) user.userPwd.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">真实姓名:</th>
            <td align="left" valign="middle"><input name="userinfo.username" type="text" size="20" maxlength="32" id="username2" onkeypress="if(event.keyCode == 13) userinfo.username2.focus();" />
            <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">性别:</th>
            <td align="left" valign="middle"><input name="userinfo.gender" type="radio" value="男" checked="checked">男   
     <input type="radio" name="userinfo.gender" value="女">女</td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">地址:</th>
            <td align="left" valign="middle"><input name="userinfo.address" type="text" id="street1" size="20" maxlength="64" onkeypress="if(event.keyCode == 13) userinfo.address.focus();" />
              <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">身份证号:</th>
            <td align="left" valign="middle"><input name="userinfo.identityNum" type="text" id="identityNum" size="20" maxlength="18" onkeypress="if(event.keyCode == 18) userinfo.identityNum.focus();" />
              <span class="star">*</span></td>
          </tr>
          <tr>
            <th align="center" valign="middle" scope="row">联系电话:</th>
            <td align="left" valign="middle"><input name="userinfo.telephone" type="text" id="telephone" size="20" maxlength="11" onkeypress="if(event.keyCode == 13) userinfo.telephone.focus();" /></td>
          </tr>
 		  <tr>
            <th align="center" valign="middle" scope="row">出生日期:</th>
            <td align="left" valign="middle"><input name="userInfo.birthday" type="text" id="birthday" size="20" maxlength="32" onkeypress="if(event.keyCode == 13) userinfo.birthday.focus();" /></td>
          </tr>
        </table>
        <p></p>
        <table width="200" border="0" align="center">
          <tr>
            <td align="center" valign="middle"><input class= "register" type="submit" value="提交" /></td>
            <td align="center" valign="middle"><input class= "register" type="reset" value="重填" /></td>
          </tr>
        </table>
      </form> 
</div>	
            
  </body>
</html>
