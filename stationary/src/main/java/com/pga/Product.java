package com.pga;

public class Product {
	private String name;
	private int qty;
	private int price;
	
	Product(String name, int qty, int price) {
		this.name = name; this.qty = qty; this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
