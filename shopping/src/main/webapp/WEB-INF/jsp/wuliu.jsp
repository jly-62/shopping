<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>最家</title>
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
				<a href="wuliu.html" class="on">查看物流</a>
			</div>
		</div>


		<!------------------------------logistic------------------------------>
		<div class="logistic">
			<ul>
				<li class="first">
					<p>2016-12-03 17:12:00</p>
					<p>妥投投递并签收，签收人：他人收 他人收</p>
					<span class="before"></span><span class="after"></span><i class="bb"></i></li>
				<li>
					<p>2016-12-03 09:55:00</p>
					<p>深圳市南油速递营销部安排投递（投递员姓名：六六六
						<a href="#">18766677721</a>;联系电话：）</p>
					<span class="before"></span><span class="after"></span></li>
				<li>
					<p>2016-12-03 02:20:00</p>
					<p>到达广东省邮政速递物流有限公司深圳航空邮件处理中心处理中心（经转）</p>
					<span class="before"></span><span class="after"></span></li>
				<li>
					<p>2016-12-02 17:12:00</p>
					<p>离开中山市 发往深圳市（经转）</p>
					<span class="before"></span><span class="after"></span></li>
				<li>
					<p>2016-12-02 09:12:00</p>
					<p>到达广东省邮政速递物流有限公司中山三角邮件处理中心处理中心（经转）</p>
					<span class="before"></span><span class="after"></span></li>
				<li>
					<p>2016-12-01 17:12:00</p>
					<p>离开泉州市 发往中山市</p>
					<span class="before"></span><span class="after"></span></li>
				<li>
					<p>2016-12-01 12:12:00</p>
					<p>泉州市速递物流分公司南区电子商务业务部已收件，（揽投员姓名：六六六;联系电话：
						<a href="#">15514257454</a>）</p>
					<span class="before"></span><span class="after"></span></li>
			</ul>
		</div>
		
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
