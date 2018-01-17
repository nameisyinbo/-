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
#div2 table{
	margin-left: 38%;
	border-color: #eff0ef;
	margin-top: 1%;
}
#div2 span{
	margin-left: 2%;
}
#div2 thead{
	background-color: #eff0ef;
}
#div3 button{
	background-color: white;
}
    </style>
</head>

<body>
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
        <label>新增&编辑用户信息</label>
        <form action="user!save" method="post">
        <table>
            <tr>
                <td>用户名称:</td>
                <td>
                    <input type="text" class="userName" name="user.userName">
                </td>
            </tr>
            <tr>
                <td>登录密码:</td>
                <td>
                    <input type="password" class="password" name="user.password">
                </td>
            </tr>
            <tr>
                <td>重复密码:</td>
                <td>
                    <input type="password" class="verifyPassword" name="user.verifyPassword">
                </td>
            </tr>
            <tr>
                <td>电子邮箱:</td>
                <td>
                    <input type="email" name="user.email" class="email">
                </td>
            </tr>
            <tr>
                <td>性别:</td>
                <td>
                    <input type="radio" name="user.sex" value="男" class="sex" checked="checked">男
                    <input type="radio" name="user.sex" value="女" class="sex">女
                </td>
            </tr>
        </table>
        <hr/>
 <div id="div4">
            <button type="submit" id="btn">保存</button>
            <button type="reset">重置</button>
            <button>返回</button>
        </div>
        </form>
           
    </div>
   <script src="https://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
    <script type="text/javascript" src="./jsp/js/regit.js"></script>
</body>

</html>