<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.yc.shopping.bean.Product"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>详情页</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css"/>
	</head>
	<body>
		<!------------------------------head------------------------------>
	
		<div class="head">
			<%@ include file="common/header.jsp" %>
		</div>
		
		<!-----------------address------------------------------->
		<div class="address">
			<div class="wrapper clearfix">
				<a href="index.html">首页</a>
				<span>/</span>
				<a href="flowerDer.html">装饰摆件</a>
				<span>/</span>
				<a href="proList.html">干花花艺</a>
				<span>/</span>
				<a href="#" class="on">【最家】非洲菊仿真花干花</a>
			</div>
		</div>
		<!-----------------------Detail------------------------------>
		<div class="detCon">
			<div class="proDet wrapper">
				<div class="proCon clearfix">
					<div class="proImg fl">
						<c:forEach items="${lPictures }" var="c" begin='0' end='0' varStatus="status">
							<img class="det" src="${c.pictureurl }" />
						</c:forEach>
						
						<div class="smallImg clearfix">
						<c:forEach items="${lPictures }" var="c"  begin='0' end='4' step='1' varStatus="status">
						<img src="${c.pictureurl }" data-src="${c.pictureurl }">
						</c:forEach>
						</div>
					</div>
					<div class="fr intro">
						<div class="title">
						<c:forEach items="${lProducts }" var="c" begin='0' end='0' varStatus="status">
							<% Product c=(Product)pageContext.getAttribute("c");
								if(c.getPname().length()>22){
									String name=c.getPname();
									c.setPname(name.substring(0,22));
								}
							%>
							<h4><%=c.getPname()%> </h4>
							<p>${c.pdesc }</p>
							<span>￥ ${c.price}</span>
						</c:forEach>
						</div>
						<div class="proIntro">
							<p>颜色分类</p>
							<div class="smallImg clearfix categ">
							<c:forEach items="${lProducts }" var="c"  begin='0' end='4' step='1' varStatus="status">
								<p class="fl"><img src="${c.colorimage }" alt="${c.color }" style="width:45px;height:45px" data-src="${c.colorimage }"></p>
							</c:forEach>
							</div>
							<c:forEach items="${lProducts }" var="c" begin='0' end='0' varStatus="status">
							<p>数量&nbsp;&nbsp;库存<span>${c.stock}</span>件</p>
						</c:forEach>
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
			</div>
		</div>
		<div class="introMsg wrapper clearfix">
			<div class="msgL fl">
				<div class="msgTit clearfix">
					<a class="on">商品详情</a>
					<a>所有评价</a>
				</div>
				<div class="msgAll">
					<div class="msgImgs">
						<c:forEach items="${lPictures }" var="c"  step='1' varStatus="status" >
							<img src="${c.pictureurl }" style="width:940px;height:696px">
						</c:forEach>
					</div>
					<div class="eva">
						<div class="per clearfix">
							<img class="fl" src="img/temp/per01.jpg">
							<div class="perR fl">
								<p>馨***呀</p>
								<p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
								<div class="clearfix">
									<p><img src="img/temp/eva01.jpg"></p>
									<p><img src="img/temp/eva02.jpg"></p>
									<p><img src="img/temp/eva03.jpg"></p>
									<p><img src="img/temp/eva04.jpg"></p>
									<p><img src="img/temp/eva05.jpg"></p>
								</div>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per02.jpg">
							<div class="perR fl">
								<p>么***周</p>
								<p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per01.jpg">
							<div class="perR fl">
								<p>馨***呀</p>
								<p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
								<div class="clearfix">
									<p><img src="img/temp/eva01.jpg"></p>
									<p><img src="img/temp/eva02.jpg"></p>
									<p><img src="img/temp/eva03.jpg"></p>
									<p><img src="img/temp/eva04.jpg"></p>
									<p><img src="img/temp/eva05.jpg"></p>
								</div>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per02.jpg">
							<div class="perR fl">
								<p>么***周</p>
								<p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per01.jpg">
							<div class="perR fl">
								<p>馨***呀</p>
								<p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
								<div class="clearfix">
									<p><img src="img/temp/eva01.jpg"></p>
									<p><img src="img/temp/eva02.jpg"></p>
									<p><img src="img/temp/eva03.jpg"></p>
									<p><img src="img/temp/eva04.jpg"></p>
									<p><img src="img/temp/eva05.jpg"></p>
								</div>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per02.jpg">
							<div class="perR fl">
								<p>么***周</p>
								<p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per01.jpg">
							<div class="perR fl">
								<p>馨***呀</p>
								<p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
								<div class="clearfix">
									<p><img src="img/temp/eva01.jpg"></p>
									<p><img src="img/temp/eva02.jpg"></p>
									<p><img src="img/temp/eva03.jpg"></p>
									<p><img src="img/temp/eva04.jpg"></p>
									<p><img src="img/temp/eva05.jpg"></p>
								</div>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per02.jpg">
							<div class="perR fl">
								<p>么***周</p>
								<p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per01.jpg">
							<div class="perR fl">
								<p>馨***呀</p>
								<p>不好意思评价晚了，产品很好，价格比玻璃品便宜，没有我担心的杂色，发货快，包装好，全5分</p>
								<div class="clearfix">
									<p><img src="img/temp/eva01.jpg"></p>
									<p><img src="img/temp/eva02.jpg"></p>
									<p><img src="img/temp/eva03.jpg"></p>
									<p><img src="img/temp/eva04.jpg"></p>
									<p><img src="img/temp/eva05.jpg"></p>
								</div>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
						<div class="per clearfix">
							<img class="fl" src="img/temp/per02.jpg">
							<div class="perR fl">
								<p>么***周</p>
								<p>花瓶超级棒，我看图以为是光面的，收货发现是磨砂，但感觉也超有质感，很喜欢。磨砂上面还有点纹路，不过觉得挺自然的，不影响美观。包装也很好，绝对不会磕碎碰坏，好评！</p>
								<p><span>2016年12月27日08:31</span><span>颜色分类：大中小三件套（不含花）</span></p>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="msgR fr">
				<h4>为你推荐</h4>
				<div class="seeList">
					<a href="#">
						<dl>
							<dt><img src="img/temp/see01.jpg"></dt>
							<dd>【最家】复古文艺风玻璃花瓶</dd>
							<dd>￥193.20</dd>
						</dl>
					</a>
					<a href="#">
						<dl>
							<dt><img src="img/temp/see02.jpg"></dt>
							<dd>【最家】复古文艺风玻璃花瓶</dd>
							<dd>￥193.20</dd>
						</dl>
					</a>
					<a href="#">
						<dl>
							<dt><img src="img/temp/see03.jpg"></dt>
							<dd>【最家】复古文艺风玻璃花瓶</dd>
							<dd>￥193.20</dd>
						</dl>
					</a>
					<a href="#">
						<dl>
							<dt><img src="img/temp/see04.jpg"></dt>
							<dd>【最家】复古文艺风玻璃花瓶</dd>
							<dd>￥193.20</dd>
						</dl>
					</a>
				</div>
				
			</div>
		</div>
		<div class="like">
			<h4>猜你喜欢</h4>
			<div class="bottom">
				<div class="hd">
					<span class="prev"><img src="img/temp/prev.png"></span>
					<span class="next"><img src="img/temp/next.png"></span>
				</div>
				<div class="imgCon bd">
					<div class="likeList clearfix">
						<div>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like01.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like02.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like03.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like04.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html" class="last">
								<dl>
									<dt><img src="img/temp/like05.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
						</div>
						<div>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like01.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like02.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like03.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html">
								<dl>
									<dt><img src="img/temp/like04.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
							<a href="proDetail.html" class="last">
								<dl>
									<dt><img src="img/temp/like05.jpg"></dt>
									<dd>【最家】复古文艺风玻璃花瓶</dd>
									<dd>￥193.20</dd>
								</dl>
							</a>
						</div>
					</div>
				</div>
			</div>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery.SuperSlide.2.1.1.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			jQuery(".bottom").slide({titCell:".hd ul",mainCell:".bd .likeList",autoPage:true,autoPlay:false,effect:"leftLoop",autoPlay:true,vis:1});
		</script>
	</body>
</html>
