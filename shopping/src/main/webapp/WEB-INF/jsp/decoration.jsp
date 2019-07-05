<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>布艺软饰</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css"/>
	</head>
	<body>
		<!------------------------------head------------------------------>
	
		<div class="head">
			 <%@ include file="common/header.jsp" %> 
			
			<%-- <%if(session.getAttribute("user")==null){%>
	<jsp:include page="common/notheader.jsp"></jsp:include>
	<% } else{%>
	<jsp:include page="common/header.jsp"></jsp:include>
	<%} %> --%>
		</div>
		
		<!------------------------------banner------------------------------>
		<div class="banner">
			<a href="#"><img src="img/temp/bzbig.jpg"/></a>
		</div>
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index.html">首页</a>
				<span>/</span>
				<a href="decoration.html" class="on">布艺软饰</a>
			</div>
		</div>
		<!-------------------current---------------------->
		<div class="current">
			<div class="wrapper clearfix">
				<h3 class="fl">布艺软饰</h3> 
				<div class="fr choice">
					<p class="default">排序方式</p>
					<ul class="select">
						<li>新品上市</li>
						<li>销量从高到低</li>
						<li>销量从低到高</li>
						<li>价格从高到低</li>
						<li>价格从低到高</li>
					</ul>
				</div>
			</div>
		</div>
		<!----------------proList------------------------->
		<ul class="proList wrapper clearfix">
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz07.jpg"></dt>
						<dd>【最家】法式乡村复古抱枕</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz06.jpg"></dt>
						<dd>【最家】时尚图案抱枕</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz05.jpg"></dt>
						<dd>【最家】北欧时尚现代动物抱枕</dd>
						<dd>￥59.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz04.jpg"></dt>
						<dd>【最家】简约格子抱枕</dd>
						<dd>￥20.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<dl>
					<dt><img src="img/temp/bz03.jpg"></dt>
					<dd>【最家】纯色棉麻抱枕</dd>
					<dd>￥47.90</dd>
				</dl>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz02.jpg"></dt>
						<dd>【最家】时尚现代叮当猫抱枕</dd>
						<dd>￥37.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz01.jpg"></dt>
						<dd>【最家】欧式现代棉麻抱枕</dd>
						<dd>￥39.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz08.jpg"></dt>
						<dd>【最家】清新乡村田园抱枕</dd>
						<dd>￥19.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz07.jpg"></dt>
						<dd>【最家】法式乡村复古抱枕</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz06.jpg"></dt>
						<dd>【最家】时尚图案抱枕</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb08.jpg"></dt>
						<dd>【最家】清新乡村田园桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb07.jpg"></dt>
						<dd>【最家】法式乡村复古桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb06.jpg"></dt>
						<dd>【最家】清新简约防水桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb05.jpg"></dt>
						<dd>【最家】北欧圣诞节防水桌布红色</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
					<dt><img src="img/temp/zb04.jpg"></dt>
					<dd>【最家】田园桌布防水防油布</dd>
					<dd>￥47.90</dd>
				</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
					<dt><img src="img/temp/zb03.jpg"></dt>
					<dd>【最家】欧式家用小方桌台布</dd>
					<dd>￥20.90</dd>
				</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb02.jpg"></dt>
						<dd>【最家】地中海格子桌布</dd>
						<dd>￥37.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb01.jpg"></dt>
						<dd>【最家】欧式田园棉麻桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb08.jpg"></dt>
						<dd>【最家】清新乡村田园桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb07.jpg"></dt>
						<dd>【最家】法式乡村复古桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb06.jpg"></dt>
						<dd>【最家】清新简约防水桌布</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/zb05.jpg"></dt>
						<dd>【最家】北欧圣诞节防水桌布红色</dd>
						<dd>￥17.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
					<dt><img src="img/temp/zb04.jpg"></dt>
					<dd>【最家】田园桌布防水防油布</dd>
					<dd>￥47.90</dd>
				</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz05.jpg"></dt>
						<dd>【最家】北欧时尚现代动物抱枕</dd>
						<dd>￥59.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz04.jpg"></dt>
						<dd>【最家】简约格子抱枕</dd>
						<dd>￥20.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<dl>
					<dt><img src="img/temp/bz03.jpg"></dt>
					<dd>【最家】纯色棉麻抱枕</dd>
					<dd>￥47.90</dd>
				</dl>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz02.jpg"></dt>
						<dd>【最家】时尚现代叮当猫抱枕</dd>
						<dd>￥37.90</dd>
					</dl>
				</a>
			</li>
			<li>
				<a href="proDetail.html">
					<dl>
						<dt><img src="img/temp/bz01.jpg"></dt>
						<dd>【最家】欧式现代棉麻抱枕</dd>
						<dd>￥39.90</dd>
					</dl>
				</a>
			</li>
		</ul>
		<!----------------mask------------------->
		<div class="mask"></div>
		<!-------------------mask内容------------------->
		<div class="proDets">
			<img class="off" src="img/temp/off.jpg" />
			<div class="tit clearfix">
				<h4 class="fl">【最家】非洲菊仿真花干花</h4>
				<span class="fr">￥17.90</span>
			</div>
			<div class="proCon clearfix">
				<div class="proImg fl">
					<img class="list" src="img/temp/proDet.jpg"  />
					<div class="smallImg clearfix">
						<img src="img/temp/proDet01.jpg" data-src="img/temp/proDet01_big.jpg">
						<img src="img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg">
						<img src="img/temp/proDet03.jpg" data-src="img/temp/proDet03_big.jpg">
						<img src="img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg">
					</div>
				</div>
				<div class="fr">
					<div class="proIntro">
						<p>颜色分类</p>
						<div class="smallImg clearfix categ">
							<p class="fl"><img src="img/temp/prosmall01.jpg" alt="白瓷花瓶+20支快乐花" data-src="img/temp/proBig01.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草" data-src="img/temp/proBig02.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall03.jpg" alt="20支快乐花" data-src="img/temp/proBig03.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="img/temp/proBig04.jpg"></p>
						</div>
						<p>数量</p>
						<div class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl" contentEditable="true">1</span>
							<img class="fl add" src="img/temp/add.jpg">
							<p class="please fl">请选择商品属性!</p>
						</div>
					</div>
					<div class="btns clearfix">
						<a href="#2"><p class="buy fl">立即购买</p></a>
						<a href="#2"><p class="cart fr">加入购物车</p></a>
					</div>
				</div>
			</div>
			<a class="more" href="proDetail.html">查看更多细节</a>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
