package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

					//Bean using Interface to call Life Cycle Methods
public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setter Method of Pepsi");
		this.price = price;
	}

	public Pepsi(double price) {
		super();
		this.price = price;
	}

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Init method of Pepsi");
		
	}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method of Pepsi");
		
	}
	
	
	
}
