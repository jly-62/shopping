<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Map"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<div class="wrapper clearfix">
				<div class="clearfix" id="top">
					<h1 class="fl"><a href="index"><img src="img/logo.png"/></a></h1>
					<div class="fr clearfix" id="top1">
						<c:if test="${!empty loginedUser }">
							<p class="fl">
							    <a href="mygxin" id="login" style='color:red;Font-size:18'>您好，尊敬的${loginedUser.username }!</a>
								<a href="login" id="login" >注销账号</a>
							</p>
						</c:if>
						<c:if test="${empty loginedUser }">
							<p class="fl">
								<a href="login" id="login" >登录</a>
								<a href="reg" id="reg">注册</a>
							</p>
						</c:if>
						
						<form action="#" method="get" class="fl">
							<input type="text" placeholder="搜索" />
							<input type="button" />
						</form>
						<div class="btn fl clearfix">
							<a href="mygxin"><img src="img/grzx.png"/></a>
							<a href="#" class="er1"><img src="img/ewm.png"/></a>
							<a href="cart"><img src="img/gwc.png"/></a>
							<p><a href="#"><img src="img/smewm.png"/></a></p>
						</div>
					</div>
				</div>
				<ul class="clearfix" id="bott">
					<li><a href="index" >首页</a></li>
					<li><a href="#">所有商品</a>
						<div class="sList">
							<div class="wrapper  clearfix">
								<a href="paint.html">
									<dl>
										<dt>
											<img src="img/nav1.jpg" />
										</dt>
										<dd>浓情欧式</dd>
									</dl>
								</a> <a href="paint.html">
									<dl>
										<dt>
											<img src="img/nav2.jpg" />
										</dt>
										<dd>浪漫美式</dd>
									</dl>
								</a> <a href="paint.html">
									<dl>
										<dt>
											<img src="img/nav3.jpg" />
										</dt>
										<dd>雅致中式</dd>
									</dl>
								</a> <a href="paint.html">
									<dl>
										<dt>
											<img src="img/nav6.jpg" />
										</dt>
										<dd>简约现代</dd>
									</dl>
								</a> <a href="paint.html">
									<dl>
										<dt>
											<img src="img/nav7.jpg" />
										</dt>
										<dd>创意装饰</dd>
									</dl>
								</a>
							</div>
						</div>
						</li>
						<c:forEach items="${cateList}" var="c">
							<li>
									<a href="flowerDer?categoryId=${c.categoryid}">${c.cname}</a>
									<div class="sList2">
										<div class="clearfix">
											<c:if test="${c.catepList!='[]' }">
												<c:forEach items="${c.catepList}" var="d">
													<a href="paint?categoryId=${d.categoryid}">${d.cname}</a>
												</c:forEach>
											</c:if> 
										</div>
									</div>
								</li>
						</c:forEach>
				</ul>
			</div>