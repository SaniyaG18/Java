package com.edubridge.pojo;

public class Menu {
	
	private int id;
	private String Name;
	private int price;
	private String quantity;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", Name=" + Name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	public Menu(String name, int price, String quantity) {
		super();
		Name = name;
		this.price = price;
		this.quantity = quantity;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
