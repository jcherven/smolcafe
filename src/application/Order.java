package application;

import java.util.ArrayList;
import java.util.List;

import foodItems.*;

public class Order {
	private List<Products> orderItems = new ArrayList<>();
	private double total = 0;
	
	public int getOrderItem(int n) {
		return n;
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public void addOrderItem(Products item) {
		
	}
}
