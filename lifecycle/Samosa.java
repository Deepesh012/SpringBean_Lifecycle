package com.springcore.lifecycle;


					//Bean using Xml to call Life Cycle Methods
public class Samosa {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Price of Samosa");
		this.price = price;
	}

	public Samosa(double price) {
		super();
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	
	public void init() {
		System.out.println("Inside init method of Samosa");
	}
	
	public void destroy() {
		System.out.println("Inside Destroy method of Samosa");
	}
	
	
}
