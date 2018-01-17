<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>用户列表</title>
    <style type="text/css">
    body{
	margin: 0;
}
#div0{
	width: 100%;
	height: 15%;
	background-color: #4c98c1;
}
#div0 .label0{
	font-size: 30px;
}
#div0 .label1{
	margin-left: 75%;
	font-size: 3px;
}
#div1{
	width: 15%;
	float: left;
	text-align: center;
	font-size: 120%;
	line-height: 4;
	background-color: #eff0ef;
}
#div1 a{
	color: black;
	text-decoration:none;
}
#div1 img{
	margin-top:100%;
}
#div1 .label2{
	font-size: 2px;
}

#div2{
	width: 85%;
	margin: 0 ;
	float: left;
	text-align: center;
}


    </style>
</head>

<body>
	<canvas id="myChart" width="400" height="400"></canvas>
    <div id="div0">
        <img src="./jsp/images/logo.png" height="40" width="40">
        <label class="label0">用户管理系统</label>
        <label class="label1">帮助&nbsp;&nbsp;退出</label>
    </div>

    <div id="div1">
        <a href="user!page">用户查询</a><br>
        <a href="user!to_save">用户新增</a><br>
        <a href="#">用户分析</a><br>
        <img src="./jsp/images/2.png" height="40" width="40">
        <br/>
        <label class="label2">当前登录用户</label>
    </div>

    <div id="div2">
    
    </div>
</body>
<script type="text/javascript" src="/jsp/plugins/jquery-3.2.1.min.js"></script>
<script type="text/javascript" src="/jsp/plugins/chart.js"></script>
</html>