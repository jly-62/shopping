package com.yc.shopping.bean;

public class Cart2 extends Cart{
	private Product product;
	private Picture picture;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	@Override
	public String toString() {
		return "Cart2 [product=" + product + ", picture=" + picture + "]";
	}
	
}
