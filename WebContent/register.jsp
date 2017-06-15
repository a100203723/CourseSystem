<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta charset="utf-8">
<title>用户注册</title>

<link rel="stylesheet" type="text/css" href="style/register-login.css">
</head>
<body>
<s:form action="register!reg.action" method="post" namespace="/">
	<div id="box"></div>
	<div class="cent-box register-box">
		<div class="cont-main clearfix">
			<div class="index-tab">
				<div class="index-slide-nav">
					<a href="register.jsp" class="active">用户注册</a>
				</div>
			</div>
			<div class="login form">
				<div class="group">
					<div class="group-ipt email">
						<input type="text" name="student.sno" id="xuehao" class="ipt"
							placeholder="学号" required>
					</div>
					<div class="group-ipt password">
						<input type="password" name="student.spassword" id="password" class="ipt"
							placeholder="设置登录密码" required>
					</div>
					<div class="group-ipt password1">
						<input type="password" name="student.spassword1" id="sname" class="ipt"
							placeholder="重复密码" required>
					</div>
					<div class="group-ipt user">
						<input type="text" name="student.sname" id="student.sname" class="ipt"
							placeholder="姓名" required>
					</div>
					<div class="group-ipt user">
						<input type="text" name="student.ssex" id="student.ssex" class="ipt"
							placeholder="性别" required>
					</div>
					<div class="group-ipt user">
						<input type="text" name="student.sclass" id="class" class="ipt"
							placeholder="班级" required>
					</div>
					<div class="group-ipt user">
						<input type="text" name="content" id="student.content" class="ipt"
							placeholder="联系方式" required>
					</div>


				</div>
			</div>

			<div class="button">
				<button type="submit" class="login-btn register-btn" id="button">注册</button>
			</div>
		</div>
	</div>



	<script src='js/particles.js' type="text/javascript"></script>
	<script src='js/background.js' type="text/javascript"></script>
	<script src='js/jquery.min.js' type="text/javascript"></script>
	<script src='js/layer/layer.js' type="text/javascript"></script>
	<script src='js/index.js' type="text/javascript"></script>
</s:form>
<script>
		$("#xuehao").change(function(){
			$.get("./login.jsp",{xuehao:$(this).val()},function(data,statu){
				alert(data);
			});
		});
</script>
</body>
</html>