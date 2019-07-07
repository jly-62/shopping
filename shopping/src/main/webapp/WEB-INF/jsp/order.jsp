<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>order</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css" />
		<link rel="stylesheet" type="text/css" href="css/mygxin.css" />
	</head>
	<body>
		<!----------------------------------------order------------------>
		<div class="head ding">
			<%@ include file="common/header.jsp" %>
			
		</div>
		<div class="order cart mt">
			<!-----------------site------------------->
			<div class="site">
				<p class="wrapper clearfix">
					<span class="fl">订单确认</span>
					<img class="top" src="img/temp/cartTop02.png">
				</p>
			</div>
			<!-----------------orderCon------------------->
			<div class="orderCon wrapper clearfix">
				<div class="orderL fl">
					<!--------h3---------------->
					<h3>收件信息<a href="#" class="fr">新增地址</a></h3>
					<!--------addres---------------->
					<div class="addres clearfix">
					<c:forEach items="${address }" var="a">
					<c:if test="${a.isdefault==0 }">
						<div class="addre fl on">
					</c:if>
					<c:if test="${a.isdefault==1 }">
						<div class="addre fl">
					</c:if>
							<div class="tit clearfix">
								<p class="fl">${a.addressee }
									<c:if test="${a.isdefault==0 }">
										<span class="default">[默认地址]</span>
									</c:if>
								</p>
								<p class="fr">
									<c:if test="${a.isdefault==1 }">
										<a href="#" class="setDefault">设为默认</a>
									</c:if>
									<a href="#">删除</a>
									<span>|</span>
									<a href="#" class="edit">编辑</a>
								</p>
							</div>
							<div class="addCon">
								<p>${a.address }</p>
								<p>${a.tel }</p>
							</div>
						</div>
					</c:forEach>
					</div>
					<h3>支付方式</h3>
					<!--------way---------------->
					<div class="way clearfix">
						<img class="on" src="img/temp/way01.jpg"> 
						<img src="img/temp/way02.jpg"> 
						<img src="img/temp/way03.jpg"> 
						<img src="img/temp/way04.jpg"> 
					</div>
					<h3>选择快递</h3>
					<!--------dis---------------->
					<div class="dis clearfix">
						<span class="on">顺风快递</span>
						<span>百世汇通</span>
						<span>圆通快递</span>
						<span>中通快递</span>
					</div>
				</div>
				
				<div class="orderR fr">
					<div class="msg">
						<h3>订单内容<a href="cart" class="fr">返回购物车</a></h3>
						<!--------ul---------------->
						<c:forEach items="${orders }" var="o">
							<ul class="clearfix">
								<li class="fl">
									<img src="img/temp/order01.jpg">
								</li>
								<li class="fl">
									<p>${o.product.pname.length()>10?o.product.pname.substring(0,10):o.product.pname }<c:if test="${o.product.pname.length()>10 }">...</c:if></p>
									<p>颜色分类：${o.product.color }</p>
									<p>数量：${o.count }</p>
								</li>
								<li class="fr">￥${o.product.price }</li>
							</ul>
						</c:forEach>
					</div>
					<!--------tips---------------->
					<div class="tips">
						<p><span class="fl">商品金额：</span><span class="fr">￥${total }</span></p>
						<p><span class="fl">优惠金额：</span><span class="fr">￥0.00</span></p>
						<p><span class="fl">运费：</span><span class="fr">免运费</span></p>
					</div>
					<!--------tips count---------------->
					<div class="count tips">
						<p><span class="fl">合计：</span><span class="fr">￥${total }</span></p>
					</div>
					<!--<input type="button" name="" value="去支付"> -->
					<a href="ok.html" class="pay">去支付</a>
				</div>
			</div>
		</div>
		<!--编辑弹框-->
		<!--遮罩-->
		<div class="mask"></div>
		<div class="adddz editAddre">
			<form action="#" method="get">
				<input type="text" placeholder="姓名" class="on" />
				<input type="text" placeholder="手机号" />
				<div class="city">
					<select name="">
						<option value="省份/自治区">省份/自治区</option>
					</select>
					<select>
						<option value="城市/地区">城市/地区</option>
					</select>
					<select>
						<option value="区/县">区/县</option>
					</select>
					<select>
						<option value="配送区域">配送区域</option>
					</select>
				</div>
				<textarea name="" rows="" cols="" placeholder="详细地址"></textarea>
				<input type="text" placeholder="邮政编码" />
				<div class="bc">
					<input type="button" value="保存" />
					<input type="button" value="取消" />
				</div>
			</form>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/user.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
