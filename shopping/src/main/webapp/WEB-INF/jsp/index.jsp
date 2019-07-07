<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>最家</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/index.css" />
	</head>
	<body >
		<!------------------------------head------------------------------>
	
		<div class="head">
			<%@ include file="common/header.jsp" %>
		</div>
		
		<!-------------------------banner--------------------------->
		<div class="block_home_slider">
			<div id="home_slider" class="flexslider">
				<ul class="slides">
					<li>
						<div class="slide">
							<img src="img/banner2.jpg"/>
						</div>
					</li>
					<li>
						<div class="slide">
							<img src="img/banner1.jpg"/>
						</div>
					</li>
				</ul>
			</div>
		</div>
		
		<!------------------------------thImg------------------------------>
		<div class="thImg">
			<div class="clearfix">
				<a href="flowerDer?categoryId=3"><img src="http://img.alicdn.com/imgextra/i2/2069538386/TB17Pi7nTnI8KJjSszbXXb4KFXa_!!0-item_pic.jpg_430x430q90.jpg" style="width:260px;height:350px"/></a>
				<a href="flowerDer?categoryId=4"><img src="img/i3.jpg"/></a>
				<a href="flowerDer?categoryId=5"><img src="http://img.alicdn.com/imgextra/i2/2264215783/O1CN01rcHtDS1saeycuZzA9_!!2264215783.jpg_430x430q90.jpg" style="width:260px;height:350px"/></a>
			</div>
		</div>
		
		<!------------------------------news------------------------------>
		<div class="news">
			<div class="wrapper">
				<h2><img src="img/ih1.jpg"/></h2>
				<div class="top clearfix">
				<c:forEach items="${homePageList1 }" var="c" begin='0' end='2' step='1'  varStatus="status"> 
					<c:choose>
					   <c:when test="${status.count eq 1}"> 
					   	<a href="proDetail?productId=${c.productid }"><img src="${c.colorimage }" style="width:545px;height:310px"/><p></p></a>  
					  </c:when>   
					   <c:otherwise>  
					   	<a href="proDetail?productId=${c.productid }"><img src="${c.colorimage }" style="width:270px;height:310px"/><p></p></a>
					  </c:otherwise>  
					</c:choose>	 
				</c:forEach>

				</div>
				<div class="top clearfix">
				<c:forEach items="${homePageList1 }" var="c" begin='3' end='5' step='1'  varStatus="status"> 
					<c:choose>
					   <c:when test="${status.count eq 3}"> 
					   	<a href="proDetail?productId=${c.productid }"><img src="${c.colorimage }" style="width:545px;height:310px"/><p></p></a>  
					  </c:when>   
					   <c:otherwise>  
					   	<a href="proDetail?productId=${c.productid }"><img src="${c.colorimage }" style="width:270px;height:310px"/><p></p></a>
					  </c:otherwise>  
					</c:choose>	 
				</c:forEach>			
				</div>
			
				<h2><img src="img/ih2.jpg"/></h2>
				<div class="flower clearfix tran">
					<c:forEach items="${homePageList2 }" var="c" begin='0' end='2' step='1'  varStatus="status"> 						
						<a href="proDetail?productId=${c.productid }" class="clearfix">
							<dl>
								<dt>
									<span class="abl"></span>
									<img src="${c.colorimage }" style="width:356px;height:356px"/>
									<span class="abr"></span>
								</dt>
								<dd>【花艺】${c.pname}</dd>
								<dd><span>¥ ${c.price }</span></dd>
							</dl>
						</a>
					</c:forEach>
				</div>
				<div class="flower clearfix tran">
				<c:forEach items="${homePageList2 }" var="c" begin='3' end='5' step='1'  varStatus="status"> 
					<a href="proDetail?productId=${c.productid }" class="clearfix">
							<dl>
								<dt>
									<span class="abl"></span>
									<img src="${c.colorimage }" style="width:356px;height:356px"/>
									<span class="abr"></span>
								</dt>
								<dd>【花艺】${c.pname}</dd>
								<dd><span>¥ ${c.price }</span></dd>
							</dl>
						</a>
				</c:forEach>
				</div>
			</div>
		</div>
		
		<!------------------------------ad------------------------------>
		<a href="#" class="ad"><img src="img/ib1.jpg"/></a>
		
		<!------------------------------people------------------------------>
		<div class="people">
			<div class="wrapper">
				<h2><img src="img/ih3.jpg"/></h2>
				
				<div class="pList clearfix tran">
				<c:forEach items="${homePageList3 }" var="c" begin='0' end='3' step='1'  varStatus="status"> 						
						<a href="proDetail?productId=${c.productid }" class="clearfix">
							<dl>
								<dt>
									<span class="abl"></span>
									<img src="${c.colorimage }" style="width:268px;height:268px"/>
									<span class="abr"></span>
								</dt>
								<dd>${c.pname}</dd>
								<dd><span>¥ ${c.price }</span></dd>
							</dl>
						</a>
					</c:forEach>
				</div>
				<div class="pList clearfix tran">
					<c:forEach items="${homePageList3 }" var="c" begin='4' end='7' step='1'  varStatus="status"> 
						<a href="proDetail?productId=${c.productid }" class="clearfix">
								<dl>
									<dt>
										<span class="abl"></span>
										<img src="${c.colorimage }" style="width:268px;height:268px"/>
										<span class="abr"></span>
									</dt>
									<dd>${c.pname}</dd>
									<dd><span>¥ ${c.price }</span></dd>
								</dl>
							</a>
					</c:forEach>
				</div>
			</div>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
				
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/nav.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/jquery.flexslider-min.js" type="text/javascript" charset="utf-8"></script>
		<script type="text/javascript">
			$(function() {
				$('#home_slider').flexslider({
					animation: 'slide',
					controlNav: true,
					directionNav: true,
					animationLoop: true,
					slideshow: true,
					slideshowSpeed:2000,
					useCSS: false
				});

			});
		</script>
		
	</body>
</html>
