<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>个人信息</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/mygrxx.css" />
	</head>
	<body>
		<!------------------------------head------------------------------>
		<div class="head ding">
			<%-- <%@ include file="common/header.jsp" %> --%>
			
			<%if(session.getAttribute("user")==null){%>
	<jsp:include page="common/notheader.jsp"></jsp:include>
	<% } else{%>
	<jsp:include page="common/header.jsp"></jsp:include>
	<%} %>
		</div>
		<!------------------------------idea------------------------------>
		<div class="address mt">
			<div class="wrapper clearfix">
				<a href="index.html" class="fl">首页</a>
				<span>/</span>
				<a href="mygxin.html" class="on">个人信息</a>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
		<!-- <div class="Bott">
			<div class="wrapper clearfix">
				<div class="zuo fl">
					<h3>
						<a href="#"><img src="img/tx.png"/></a>
						<p class="clearfix"><span class="fl">[羊羊羊]</span><span class="fr">[退出登录]</span></p>
					</h3>
					<div>
						<h4>我的交易</h4>
						<ul>
							<li><a href="cart.html">我的购物车</a></li>
							<li><a href="myorderq.html">我的订单</a></li>
							<li><a href="myprod.html">评价晒单</a></li>
						</ul>
						<h4>个人中心</h4>
						<ul>
							<li><a href="mygxin.html">我的中心</a></li>
							<li><a href="address.html">地址管理</a></li>
						</ul>
						<h4>账户管理</h4>
						<ul>
							<li><a href="mygrxx.html">个人信息</a></li>
							<li  class="on"><a href="remima.html">修改密码</a></li>
						</ul>
					</div>
				</div> -->
				
				<%@ include file="common/bott.jsp" %>
	
				<div class="you fl">
					<h2>修改密码</h2>
					 <form action="#" method="get" class="remima">
						<p><span>选择验证身份方式：</span><input type="checkbox" />密码验证  <input type="checkbox" />邮箱验证 </p>
						<p><span>原密码：</span><input type="text" /></p>
						<p class="op">输入原密码</p>
						<p><span>新密码：</span><input type="text" /></p>
						<p class="op">6-16 个字符，需使用字母、数字或符号组合，不能使用纯数字、纯字母、纯符号</p>
						<p><span>重复新密码：</span><input type="text" /></p>
						<p class="op">请再次输入密码</p>
						
						
					    <p><span>验证码：</span><input type="text" /><img src="img/temp/code.jpg" alt="" /></p>
						<p class="op">按右图输入验证码，不区分大小写</p>
						<input type="submit" value="提交" /> 
						
						<!-- <label id="password-lbl" for="password" class="required">验证码 ：</label>
						<div style="clear: none;">
						<input name="smscode" id="register_sms" placeholder="输入验证码" type="text">
						<img src="Check.s" width="124" height="33" id="img">
						<a onClick="ck()"><h5>看不清？点我刷新验证码</h5></a> -->
								
						</div>
						
						
					</form> 
					
					
				</div>
			</div>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
