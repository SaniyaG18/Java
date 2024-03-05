package com.edubridge.pojo;

public class Product {
	
	private int id ;
	private String pName;
	private int price;
	private int quantity;
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", pName=" + pName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Product( String pName, int price, int quantity) {
		super();
		
		this.pName = pName;
		this.price = price;
		this.quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
