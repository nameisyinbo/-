<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/paging" prefix="zj"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<title>用户列表</title>
<link rel="stylesheet"
	href="https://cdn.bootcss.com/bootstrap/4.0.0-beta/css/bootstrap.min.css">

<style type="text/css">
body {
	margin: 0;
}

#div0 {
	width: 100%;
	height: 15%;
	background-color: #4c98c1;
}

#div0 .label0 {
	font-size: 30px;
}

#div0 .label1 {
	margin-left: 75%;
	font-size: 3px;
}

#div1 {
	width: 15%;
	float: left;
	text-align: center;
	font-size: 120%;
	line-height: 4;
	background-color: #eff0ef;
}

#div1 a {
	color: black;
	text-decoration: none;
}

#div1 img {
	margin-top: 100%;
}

#div1 .label2 {
	font-size: 2px;
}

#div2 {
	width: 85%;
	margin: 0;
	float: left;
}

#div2 table {
	margin-left: 2%;
	border-color: #eff0ef;
	margin-top: 1%;
	width: 60%;
}

#div2 span {
	margin-left: 2%;
}

#div2 thead {
	background-color: #eff0ef;
}
</style>
</head>

<body>
	<div id="div0">
		<img src="./jsp/images/logo.png" height="40" width="40"> <label
			class="label0">用户管理系统</label> <label class="label1">帮助&nbsp;&nbsp;退出</label>
	</div>
	<div id="div1">
		<a href="use!page">用户查询</a><br>
		<a href="user!to_save">用户新增</a><br>
		<a href="#">用户分析</a><br> <img src="./jsp/images/2.png"
			height="40" width="40"> <br /> <label class="label2">当前登录用户</label>
	</div>

	<div id="div2">
		<span>用户名称:</span> <input type="text" name="">
		<button>查询</button>
		<div id="div3">
			<table frame="box" rules="all">
				<thead>
					<td>编号</td>
					<td>用户名称</td>
					<td>邮箱</td>
					<td>性别</td>
					<td>创建时间</td>
					<td>更改时间</td>
					<td>操作</td>
				</thead>
				<tbody>
					<c:forEach items="${list }" var="object">
						<tr>
							<td>${object.id }</td>
							<td>${object.userName }</td>
							<td>${object.email }</td>
							<td>${object.sex }</td>
							<td>${object.creationTime }</td>
							<td>${object.updateTime }</td>
							<td><a href="user!to_edit?user.id=${object.id }">编辑</a> <a
								href="user!delete?user.id=${object.id }">删除</a></td>
						</tr>
					</c:forEach>
				</tbody>

			</table>
	<zj:paging pageSize="${page.pageSize}" pageNo="${page.pageNo}" url="user!page" totalCount="${page.totalCount}" />
		</div>
	</div>
	<script src="https://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
	<script type="text/javascript" src="./js/regit.js"></script>
</body>

</html>