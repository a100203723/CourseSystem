<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<script src="SpryAssets/SpryTabbedPanels.js" type="text/javascript"></script>
<link href="SpryAssets/SpryTabbedPanels.css" rel="stylesheet" type="text/css" />
</head>
<style>
table{
	border-collapse: collapse;
	border-spacing: 0;
	animation-delay: 1;
}
td{
text-align: center;

}
</style>
<body>
<div><h1>个人课表查询</h1></div>
<div align="right">${sname}.<a href="">注销</a>&nbsp;&nbsp;&nbsp;</div><!--我这里还没有链接上登录界面-->
<div>
  <div id="TabbedPanels1" class="TabbedPanels">
    <ul class="TabbedPanelsTabGroup">
      <li class="TabbedPanelsTab" tabindex="0">我的课程</li>
      <li class="TabbedPanelsTab" tabindex="0">个人信息</li>
    </ul>
    <div class="TabbedPanelsContentGroup">
      <div class="TabbedPanelsContent">
      <div align="center" style="font-size:20px">
      <form action="check" method="post" namespace="/">
      <select name="xuenian" size="1">
      <option value="2015~2016">2015~2016</option>
      <option value="2016~2017">2016~2017</option>
      <option value="2017~2018">2017~2018</option>
      </select>
      学年
      <select name="xueqi" size="1">
      <option value="shang">上</option>
      <option value="xia">下</option>
      </select>
      学期
      </div>
      <table width=99% border="1" align="center" cellspacing="0" id="mytable">
  <tr>
    <th scope="col" colspan="2"></th>
    <th scope="col" id="h1">星期一</th>
    <th scope="col" id="h2">星期二</th>
    <th scope="col" id="h3">星期三</th>
    <th scope="col" id="h4">星期四</th>
    <th scope="col" id="h5">星期五</th>
    <th scope="col" id="h6">星期六</th>
    <th scope="col" id="h7">星期日</th>
  </tr>
  <tr>
    <td rowspan="2" align=>上<br/>午</td>
    <td>1~2节</td>
    <td id="t11">&nbsp;</td>
    <td id="t12">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>3~4节</td>
    <td id="t21">&nbsp;</td>
    <td id="t22">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td rowspan="2" align=>下<br/>午</td>
    <td>5~6节</td>
    <td id="t31">&nbsp;</td>
    <td id="t32">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
  <tr>
    <td>7~8节</td>
    <td id="t41">&nbsp;</td>
    <td id="t42">&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
    <td>&nbsp;</td>
  </tr>
</table>
</form >
      </div>
      <div class="TabbedPanelsContent">
      <form>
      <table>
      学号：${sno}<br />
      班级：${class1}<br />
      姓名：${sname}<br />
      性别：${sex}<br />
      <input type="button" value="信息有误,给管理员发邮件">
      </table>
      </form>
      </div>
    </div>
  </div>
</div>
<script src="js/jquery.min.js"></script>
<script type="text/javascript">
var TabbedPanels1 = new Spry.Widget.TabbedPanels("TabbedPanels1");
  $.ajax({
    url:"check!scheck.action",
    type:"GET",
    dataType:"json",
    success:function(data) {
      console.log(JSON.stringify(data)); 
      var mytable=document.getElementById("mytable");
      for(var i = 0; i < data.length; i ++ ) {
    	  var l = data[i].coursertime;//列数
    	  var c = 0;//h行数
    	 // alert(data[i].coursedata)
    	  if(data[i].coursedata.indexOf("8:40")>(-1)) {
    		  c = 1;//第2行
    		  mytable.rows[c].cells[l+1].innerHTML=data[i].course.cname+"<br />"+data[i].courseaddr+"<br />"+data[i].coursedata;
    		 // alert(data[i].course.cname);
    	  } else if (data[i].coursedata.indexOf("10:30")>(-1)) {
    		  c = 2;//第3行
    		  mytable.rows[c].cells[l].innerHTML=data[i].course.cname+"<br />"+data[i].courseaddr+"<br />"+data[i].coursedata;
    	  } else if (data[i].coursedata.indexOf("2:00")>(-1)) {
    		 c = 3;//第4行
    		  mytable.rows[c].cells[l+1].innerHTML=data[i].course.cname+"<br />"+data[i].courseaddr+"<br />"+data[i].coursedata;
    	  } else if (data[i].coursedata.indexOf("3:50")>(-1)) {
    		 c = 4;//第5行
    		 mytable.rows[c].cells[l].innerHTML=data[i].course.cname+"<br />"+data[i].courseaddr+"<br />"+data[i].coursedata;
    	  } 
      }
    }
  });
</script>
</body>
</html>
