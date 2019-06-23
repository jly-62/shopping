<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head lang="en">
		<meta charset="utf-8" />
		<title>cart</title>
		<link rel="stylesheet" type="text/css" href="css/public.css"/>
		<link rel="stylesheet" type="text/css" href="css/proList.css" />
	</head>
	
<style type="text/css">
/* 去下划线 */
a{text-decoration:none;}

</style>
	<body>
		<!--------------------------------------cart--------------------->
		<div class="head ding">
			<%@ include file="common/header.jsp" %>
		</div>
		<div class="cart mt">
			<!-----------------logo------------------->
			<!--<div class="logo">
				<h1 class="wrapper clearfix">
					<a href="index.html"><img class="fl" src="img/temp/logo.png"></a>
					<img class="top" src="img/temp/cartTop01.png">
				</h1>
			</div>-->
			<!-----------------site------------------->
			<div class="site">
				<p class=" wrapper clearfix">
					<span class="fl">购物车</span>
					<img class="top" src="img/temp/cartTop01.png">
					<a href="mygxin" class="fr" style='color:red;Font-size:18'>返回个人中心&gt;</a>
					<a href="index" class="fr">继续购物&gt;</a>
				</p>
			</div>
			<!-----------------table------------------->
			<div class="table wrapper">
				<div class="tr">
					<div>商品</div>
					<div>单价</div>
					<div>数量</div>
					<div>小计</div>
					<div>操作</div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart01.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥20.00</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥20.00</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart02.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥30.00</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥30.00</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart03.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥59.99</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥59.99</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart01.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥20.00</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥20.00</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart02.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥30.00</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥30.00</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="th">
					<div class="pro clearfix">
						<label class="fl">
							<input type="checkbox"/>
    						<span></span>
						</label>
						<a class="fl" href="#">
							<dl class="clearfix">
								<dt class="fl"><img src="img/temp/cart03.jpg"></dt>
								<dd class="fl">
									<p>创意现代简约干花花瓶摆件</p>
									<p>颜色分类:</p>
									<p>白色瓷瓶+白色串枚</p>
								</dd>
							</dl>
						</a>
					</div>
					<div class="price">￥59.99</div>
					<div class="number">
						<p class="num clearfix">
							<img class="fl sub" src="img/temp/sub.jpg">
							<span class="fl">1</span>
							<img class="fl add" src="img/temp/add.jpg">
						</p>
					</div>
					<div class="price sAll">￥59.99</div>
					<div class="price"><a class="del" href="#2">删除</a></div>
				</div>
				<div class="goOn">空空如也~<a href="index.html">去逛逛</a></div>
				<div class="tr clearfix">
					<label class="fl">
						<input class="checkAll" type="checkbox"/>
						<span></span>
					</label>
					<p class="fl">
						<a href="#">全选</a>
						<a href="#" class="del">删除</a>
					</p>
					<p class="fr">
						<span>共<small id="sl">0</small>件商品</span>
						<span>合计:&nbsp;<small id="all">￥0.00</small></span>
						<a href="order.html" class="count">结算</a>
					</p>
				</div>
			</div>
		</div>
		<div class="mask"></div>
		<div class="tipDel">
			<p>确定要删除该商品吗？</p>
			<p class="clearfix">
				<a class="fl cer" href="#">确定</a>
				<a class="fr cancel" href="#">取消</a>
			</p>
		</div>
		<!------------------------------footer------------------------------>
		<%@ include file="common/footer.jsp"%>
		
		<!----------------mask------------------->
		<div class="mask"></div>
		<!-------------------mask内容------------------->
		<div class="proDets">
			<img class="off" src="img/temp/off.jpg" />
			<div class="proCon clearfix">
				<div class="proImg fr">
					<img class="list" src="img/temp/proDet.jpg"  />
					<div class="smallImg clearfix">
						<img src="img/temp/proDet01.jpg" data-src="img/temp/proDet01_big.jpg">
						<img src="img/temp/proDet02.jpg" data-src="img/temp/proDet02_big.jpg">
						<img src="img/temp/proDet03.jpg" data-src="img/temp/proDet03_big.jpg">
						<img src="img/temp/proDet04.jpg" data-src="img/temp/proDet04_big.jpg">
					</div>
				</div>
				<div class="fl">
					<div class="proIntro change">
						<p>颜色分类</p>
						<div class="smallImg clearfix">
							<p class="fl on"><img src="img/temp/prosmall01.jpg" alt="白瓷花瓶+20支快乐花" data-src="img/temp/proBig01.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall02.jpg" alt="白瓷花瓶+20支兔尾巴草" data-src="img/temp/proBig02.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall03.jpg" alt="20支快乐花" data-src="img/temp/proBig03.jpg"></p>
							<p class="fl"><img src="img/temp/prosmall04.jpg" alt="20支兔尾巴草" data-src="img/temp/proBig04.jpg"></p>
						</div>
					</div>
					<div class="changeBtn clearfix">
						<a href="#2" class="fl"><p class="buy">确认</p></a>
						<a href="#2" class="fr"><p class="cart">取消</p></a>
					</div>
				</div>
			</div>
		</div>
		<div class="pleaseC">
			<p>请选择宝贝</p>
			<img class="off" src="img/temp/off.jpg" />
		</div>
		<script src="js/jquery-1.12.4.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/public.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/pro.js" type="text/javascript" charset="utf-8"></script>
		<script src="js/cart.js" type="text/javascript" charset="utf-8"></script>
	</body>
</html>
