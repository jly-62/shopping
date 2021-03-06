<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript" src="./js/jquery.min.js"></script>

<script>

	//获取验证码
	function getVerify() {
		$("#imgVerify").attr("src", 'code/getVerify?' + Math.random());
	}
</script>


<head>
<meta charset="UTF-8">
<title>登录</title>
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet" type="text/css" href="css/login.css" />
</head>
<body>

	<!-------------------login-------------------------->
	<div class="login">



		<%-- <form action="#" method="post">
				<h1><a href="index.html"><img src="img/temp/logo.png"></a></h1>
				<p></p>
				<div class="msg-warn hide"><b></b>公共场所不建议自动登录，以防账号丢失</div>
				<p><input type="text" name="" value="" placeholder="昵称/邮箱/手机号"></p>
				<p><input type="text" name="" value="" placeholder="密码"></p>
				<p><input type="submit" name="" value="登  录"></p>
				<p class="txt"><a class="" href="reg.html">免费注册</a><a href="forget.html">忘记密码？</a></p>
			</form> --%>





		<form:form action="index" method="post" id="loginForm"
			modelAttribute="User">
			<h1>
				<a href="index"><img src="img/temp/logo.png"></a>
			</h1>
			<p></p>
			<div class="msg-warn hide">
				<b></b>公共场所不建议自动登录，以防账号丢失
			</div>
			<form:input type="text" class="text" path="username"
				placeholder="昵称/邮箱/手机号" onfocus="this.value = '';"></form:input>
			<form:errors path="username"></form:errors>


			<form:input type="password" path="upwd" placeholder="密码"></form:input>
			<form:errors path="upwd"></form:errors>
			<div>

				<div>
					<%-- <form:input type="tel" path="code" placeholder="请输入验证码"
						maxlength="4"/>
					<form:errors path="code"></form:errors> --%>
				</div>
			</div>
			<div>
				<a href="javascript:void(0);" rel="external nofollow"
					title="点击更换验证码"> 
				
		<img id="imgVerify" src="code/getVerify" 
		height="36" width="170" onclick="getVerify(this);"></img>
				</a>
			</div>



			<p>
				<input type="submit" name="" value="登  录">
			</p>
			<p class="txt">
				<a class="" href="reg">免费注册</a><a href="forget">忘记密码？</a>
			</p>

		</form:form>
	</div>

</body>
</html>
