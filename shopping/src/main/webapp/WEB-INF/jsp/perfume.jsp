<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>蜡艺香薰</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css"/>
	</head>
	<body>
		<!------------------------------head------------------------------>
	
		<div class="head">
			<%-- <%@ include file="common/header.jsp" %> --%>
			
			<%if(session.getAttribute("user")==null){%>
	<jsp:include page="common/notheader.jsp"></jsp:include>
	<% } else{%>
	<jsp:include page="common/header.jsp"></jsp:include>
	<%} %>
		</div>
		
		<!-----------------banner------------------------------->
		<div class="banner">
			<a href="#"><img src="img/temp/perfume_Banner.jpg"/></a>
		</div>	
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index.html">首页</a>
				<span>/</span>
				<a href="perfume.html" class="on">蜡艺香薰</a>
			</div>
		</div>
		<!-----------------paintCon------------------------------->
		<div class="paintCon">
			<section class="wrapper">
				<h3><img src="img/temp/perfumeTit01.jpg"></h3>
				<img src="img/temp/xxB01.jpg" />
				<div class="paintList">
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx01.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx02.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx103.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx104.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx105.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx106.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
				</div>
			</section>
			<section class="wrapper">
				<h3><img src="img/temp/perfumeTit02.jpg"></h3>
				<img src="img/temp/xxB02.jpg" />
				<div class="paintList">
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx201.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx202.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx203.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx204.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx205.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
					<a href="proDetail.html">
						<dl>
							<dt><img src="img/temp/xx206.jpg"></dt>
							<dd>新中式客厅山水装饰画墙壁挂画 </dd>
							<dd>￥299.90</dd>
						</dl>
					</a>
				</div>
			</section>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
		<!--<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>-->
	</body>
</html>
