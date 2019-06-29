<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<%@ include file="common/common.jsp" %>

<section class="rt_wrap content mCustomScrollbar">
 <div class="rt_content">
      <div class="page_title">
       <h2 class="fl">订单详情示例</h2>
      </div>
      <table class="table">
       <tr>
        <td>收件人：${adminOrderDeatil.address.addressee }</td>
        <td>联系电话：${adminOrderDeatil.address.tel }</td>
        <td>收件地址：${adminOrderDeatil.address.address }</td>
        <td>付款时间：<fmt:formatDate value="${adminOrderDeatil.paydate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
       </tr>
       <tr>
        <td>下单时间：<fmt:formatDate value="${adminOrderDeatil.createdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        <td>付款时间：<fmt:formatDate value="${adminOrderDeatil.paydate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        <td>确认时间：<fmt:formatDate value="${adminOrderDeatil.confirmdate }" pattern="yyyy-MM-dd HH:mm:ss"/></td>
        <td>评价时间时间：---</td>
       </tr>
       <tr>
        <td>订单状态：<a>${adminOrderDeatil.status }</a></td>
        <td colspan="3">订单备注：<mark>帮我检查好呀~谢谢~</mark></td>
        </tr>
      </table>
      <table class="table">
      <thead>
      	<td class="center">商品图片</td>
        <td class="center">商品名称</td>
        <td class="center">商品编号</td>
        <td class="center">商品价格</td>
        <td class="center">商品颜色</td>
        <td class="center">商品数量</td>
        <td class="center">支付价格</td>
      </thead>
       <tr>
        <td class="center"><img src="upload/goods01.jpg" width="50" height="50"/></td>
        <td class="center">${adminOrderDeatil.product.pname }</td>
        <td class="center">${adminOrderDeatil.product.pid }</td>
        <td class="center"><strong class="rmb_icon">${adminOrderDeatil.product.price }</strong></td>
        <td class="center">${adminOrderDeatil.product.color }</td>
        <td class="center"><strong>${adminOrderDeatil.product.stock }</strong></td>
        <td class="center"><strong class="rmb_icon">${adminOrderDeatil.orderinfo.payprice }</strong></td>
       </tr>
      </table>
      <aside class="mtb" style="text-align:right;">
       <label>管理员操作：</label>
       <input type="text" class="textbox textbox_295" placeholder="管理员操作备注"/>
       <input type="button" value="付款" class="group_btn"/>
       <input type="button" value="配货" class="group_btn"/>
       <input type="button" value="发货" class="group_btn"/>
       <input type="button" value="确认收货" class="group_btn"/>
      </aside>
 </div>
</section>
</body>
</html>
