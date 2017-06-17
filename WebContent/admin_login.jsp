<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta author="zhangchen">
	<title>管理员登录</title>
	<link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
<div id="box"></div>
<div class="cent-box">
	<div class="cent-box-header">
		<h1 class="main-title ">管理员登录</h1>
		
	</div>

	<div class="cont-main clearfix">
		<div class="index-tab">
			
                 
							
			</div>
		</div>

		<div class="login form">
			<div class="group">
				<div class="group-ipt email">
					<input type="text" name="admin" id="admin" class="ipt" placeholder="输入管理员账号" maxlength="12"
					 	onkeyup="if(/\D/.test(this.value)){alert('只能输入数字');this.value='';}"
					 	required>
				</div>
				<div class="group-ipt password">
					<input type="password" name="password" id="password" class="ipt" placeholder="输入管理员密码" maxlength="12"
						required>
				</div>
	
			</div>
		</div>

		<div class="button">
			<button type="submit" class="login-btn register-btn" id="button">登录</button>
		</div>


			
		</div>
	</div>
</div>

<

<script src='js/particles.js' type="text/javascript"></script>
<script src='js/background.js' type="text/javascript"></script>
<script src='js/jquery.min.js' type="text/javascript"></script>
<script src='js/layer/layer.js' type="text/javascript"></script>
<script src='js/index.js' type="text/javascript"></script>

</body>
</html>