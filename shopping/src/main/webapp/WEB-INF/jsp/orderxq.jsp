<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>个人信息</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/myorder.css" />
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
				<a href="myorderq.html" class="on">我的订单</a>
				<span>/</span>
				<a href="#" class="on">订单详情</a>
			</div>
		</div>
		
		<!------------------------------Bott------------------------------>
		<div class="Bott">
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
							<li class="on"><a href="myorderq.html">我的订单</a></li>
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
							<li><a href="remima.html">修改密码</a></li>
						</ul>
					</div>
				</div>
				<div class="you fl">
					<div class="my clearfix">
						<h2>订单详情<a href="#">请谨防钓鱼链接或诈骗电话，了解更多&gt;</a></h2>
						<h3>订单号：<span>54163846846848468</span></h3>
					</div>
					<div class="orderList">
						<div class="orderList1">
							<h3>已收货</h3>
							<div class="clearfix">
								<a href="#" class="fl"><img src="img/g1.jpg"/></a>
								<p class="fl"><a href="#">家用创意菜盘子圆盘 釉下彩复古</a><a href="#">¥99.00×1</a></p>
							</div>
						</div>
						<div class="orderList1">
							<h3>收货信息</h3>
							<p>姓 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;名：<span>杨小黄</span></p>
							<p>联系电话：<span>157*****121</span></p>
							<p>收货地址：<span>河北 唐山市 路北区 高新软件园</span></p>
						</div>
						<div class="orderList1">
							<h3>支付方式及送货时间</h3>
							<p>支付方式：<span>在线支付</span></p>
							<p>送货时间：<span>不限送货时间</span></p>
						</div>
						<div class="orderList1 hei">
							<h3><strong>商品总价：</strong><span>¥99</span></h3>
							<p><strong>运费：</strong><span>¥0</span></p>
							<p><strong>订单金额：</strong><span>¥99</span></p>
							<p><strong>实付金额：</strong><span>¥99</span></p>
						</div>
						
					</div>
					
					
				</div>
			</div>
		</div>
		<
		
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
