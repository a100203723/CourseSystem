<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta author="zhangchen">
	<title>教师登录</title>
	<link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box">
	

	<div class="cont-main clearfix">
		<div class="index-tab">
			<div class="index-slide-nav">
				<a href="login.jsp" >学生</a>
				<a href="login_2.jsp"class="active">教师</a>
                 <a href="admin_login.jsp">管理员</a>
							
			</div>
		</div>

		<div class="login form">
			<div class="group">
				<div class="group-ipt email">
					<input type="text" name="gonghao" id="gonghao" class="ipt" placeholder="输入您的工号" maxlength="8"
						onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"
					 	required>
				</div>
				<div class="group-ipt password">
					<input type="password" name="password" id="password" class="ipt" placeholder="输入您的登录密码" maxlength="12"
					 	onkeyup="value=value.replace(/[\W]/g,'') " onbeforepaste="clipboardData.setData('text',clipboardData.getData('text').replace(/[^\d]/g,''))"
					 	required>
				</div>
	
			</div>
		</div>

		<div class="button">
			<button type="submit" class="login-btn register-btn" id="button">登录</button>
		</div>

		<div class="remember clearfix">
			<label class="remember-me"><span class="icon"><span class="zt"></span></span><input type="checkbox" name="remember-me" id="remember-me" class="remember-mecheck" checked>记住我</label>
			
		</div>
	</div>
</div>



<script src='js/particles.js' type="text/javascript"></script>
<script src='js/background.js' type="text/javascript"></script>
<script src='js/jquery.min.js' type="text/javascript"></script>
<script src='js/layer/layer.js' type="text/javascript"></script>
<script src='js/index.js' type="text/javascript"></script>

</body>
</html>