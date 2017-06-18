<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<title>div css3 侧边菜单导航栏-www.codesc.net</title>
<style type="text/css">
* {
	margin: 0;
	padding: 0;
	list-style-type: none;
}
a, img {
	border: 0;
}
body {
	font: 12px/180% Arial, Helvetica, sans-serif, "微软雅黑";
}
.demo {
	margin: 60px auto;
	width: 720px;
}
.navbox {
	float: left;
}
ul.nav {
	width: 200px;
	padding: 60px 0 60px 0;
	background: url() no-repeat;
}
ul.nav li {
	margin: 5px 0 0 0;
}
ul.nav li a {
	background: #cbcbcb url() no-repeat;
	color: #174867;
	padding: 7px 15px 7px 15px;
	width: 100px;
	display: block;
	text-decoration: none;
	-webkit-transition: all 0.3s ease-out;
	-moz-transition: all 0.3s ease-out;
	-o-transition: all 0.3s ease-out;
	-webkit-box-shadow: 2px 2px 4px #888;
	-moz-box-shadow: 2px 2px 4px #888;
	-o-box-shadow: 2px 2px 4px #888;
}
ul.nav li a:hover {
	background: #ebebeb url() no-repeat;
	color: #67a5cd;
	padding: 7px 15px 7px 30px;
}
</style>
<body bgcolor="#3f4258">
<br>
<br>
<div style="width:120px; height:120px; border-radius:50%; overflow:hidden;">
<img src="abc.jpg"/>
</div>


<div class="demo">
  <div class="navbox">
    <ul class="nav">
      <li><a href="1/index.jsp" target="mainFrame">主页</a></li>
      <li><a href="gerenxinxi.jsp" target="mainFrame">个人空间</a></li>
      <li><a href="studentcheck.jsp" target="mainFrame">我的课表</a></li>
      <li><a href="#">班级</a></li>
      <li><a href="#">没用</a></li>
      <li><a href="#">没用</a></li>
      <li><a href="#">没用</a></li>
      <li><a href="#">没用</a></li>
      <li><a href="#">没用</a></li>
      <li><a href="#">没用</a></li>
    </ul>
  </div>
</div>
</body>
<html>
