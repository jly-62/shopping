package com.yc.shopping.bean;

public class Orders2 extends Orders{
	private Address address;
	private User user;
	private Product product;
	private Orders2 orders2;
	private Orderinfo orderinfo;
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Orders2 getOrders2() {
		return orders2;
	}
	public void setOrders2(Orders2 orders2) {
		this.orders2 = orders2;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public Orderinfo getOrderinfo() {
		return orderinfo;
	}
	public void setOrderinfo(Orderinfo orderinfo) {
		this.orderinfo = orderinfo;
	}
	
	
}
