<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>注册</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/login.css"/>
	</head>
	<script type="text/javascript">
	function ale()
	{//这个基本没有什么说的，就是弹出一个提醒的对话框
	    alert("注册成功，点击跳转为登录页面");
	}
	
	</script>
	<body>
		<!-------------------reg-------------------------->
		<div class="reg">
			<!-- <form action="toreg" method="post">
				<h1><a href="index.html"><img src="img/temp/logo.png"></a></h1>
				<p>用户注册</p>
				<p><input type="text" name="" value="" placeholder="请输入邮箱"></p>
				<p><input type="text" name="" value="" placeholder="请输入密码"></p>
				<p><input type="text" name="" value="" placeholder="请确认密码"></p>
				<p class="txtL txt"><input class="code" type="text" name="" value="" placeholder="验证码"><img src="img/temp/code.jpg"></p>
				<p><input type="submit" name="" value="注册"></p>
				<p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#"><使用条款和隐私策略></a></p>
				<p class="txt"><a href="login"><span></span>已有账号登录</a></p>
				<a href="#" class="off"><img src="img/temp/off.png"></a>
			</form> -->
			
			<form:form action="reg" method="post" id="regForm"
			modelAttribute="User">
			<h1><a href="index"><img src="img/temp/logo.png"></a></h1>
				<p>用户注册</p>
			<form:input type="text" class="text" path="username" value="" onfocus="this.value = '';" placeholder="用户名"></form:input>
			<form:errors path="username"></form:errors>
			
			<form:input type="text" path="upwd" value="" onfocus="this.value = '';" id="pwd1" placeholder="密码"></form:input>
			<form:errors path="upwd"></form:errors>
			<input type="text" id="reupwd" value="" onfocus="this.value = '';" id="pwd2" placeholder="确认密码"></input>
			<form:errors path="upwd"></form:errors>
			
			<form:input type="text" class="text" path="email" value="" onfocus="this.value = '';" placeholder="邮箱"></form:input>
			<form:errors path="email"></form:errors>
			<form:input type="text" class="text" path="tel" value="" onfocus="this.value = '';" placeholder="电话号码"></form:input>
			<form:errors path="tel"></form:errors>
			<p class="txtL txt"><input class="code" type="text" name="" value="" placeholder="验证码"><input type="submit"  value="从邮箱获取验证码"></p>
				<p><input type="submit" name="" value="注册" onclick="ale()"></p>
				<p class="txtL txt">完成此注册，即表明您同意了我们的<a href="#"><使用条款和隐私策略></a>
				<p class="txt"><a href="login"><span></span>已有账号登录</a></p>
				<a href="index" class="off"><img src="img/temp/off.png"></a>
		</form:form>
		</div>
	</body>
</html>
