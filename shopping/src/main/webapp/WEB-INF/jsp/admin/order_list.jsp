<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8"/>
<title>后台管理系统</title>
<script type="text/javascript">
function query(){
	$('#dg').datagrid('load',{
		status:$("#status").val(),
		oid:$("#oid").val()
	});
}

function username(val, row, index){
	val =row.address.addressee;
	return val;
}
function tel(val, row, index){
	val =row.address.tel;
	return val;
}
function address(val, row, index){
	val =row.address.address;
	return val;
}
//列格式化函数
function fmtop(value, row, index){
	//row ==> json 字符串
	/* 
	//方式一 转json 会出现问题
	var json = JSON.stringify(row);
	return '<input type="button" value="修改" onclick=\'modify('+json+')\'>'; */
	
	//方式二
	return '<a href="adminOrderDeatil?id='+row.oid+'" class="link_icon" >查看订单</a>'; 
}
</script>
<%@ include file="common/common.jsp" %>
<a ></a>
<section class="rt_wrap content mCustomScrollbar">
 <div class="rt1_content" >
      <div class="page_title">
       <h2 class="fl">订单列表示例</h2>
       <a class="fr top_rt_btn add_icon">添加商品</a>
      </div>
	<div style="width:100%;height:600px;">
      <table class="easyui-datagrid" id="dg" 
		data-options="
			fitColumns:true,
			singleSelect:true,
			fit:true,
			pagination:true,
			pageSize:5,
			pageList:[5,10,20],
			url:'adminOrders/query',
			rownumbers:true,
			toolbar:'#tb'">
		<thead>
			<tr>
				<th data-options="field:'oid',width:100">订单编号</th>
				<th data-options="field:'username',formatter:username,width:100">收件人</th>
				<th data-options="field:'tel',width:200,formatter:tel">联系电话</th>
				<th data-options="field:'address',width:400,formatter:address">收件人地址</th>
				<th data-options="field:'price',width:100">订单金额</th>
				<th data-options="field:'sendment',width:200">配送方式</th>
				<th data-options="field:'id',width:200,formatter:fmtop">操作</th>
			</tr>
		</thead>
	</table>
	</div>
	<div id="tb" style="padding:5px;height:auto">
		<section class="mtb">
	       <select class="select" id="status">
	        <option value="0">订单状态</option>
	        <option value="1">待付款</option>
	        <option value="2">已发货</option>
	        <option value="3">待发货</option>
	        <option value="4">待评价</option>
	       </select>
	       <input type="text" id="oid" class="textbox textbox_225" placeholder="输入订单编号"/>
	       <input type="button" value="查询" class="group_btn" onclick="query()"/>
      </section>
	</div>
	
 </div>
</section>
</body>
</html>
