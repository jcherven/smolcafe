package application;

import java.util.ArrayList;
import java.util.List;

import foodItems.*;

public class Cafe {
	private String greeting;
	private List<Products> menu = new ArrayList<>();

	public Cafe() {
		// set today's greeting
		this.greeting = new String("Welcome to Smol Cafe.");

		// instantiate today's menu items
		final BubbleTea smolBoba = new BubbleTea();
		final AlmondCookies smolCookies = new AlmondCookies();

		// populate menu with today's products
		menu.add(smolBoba);
		menu.add(smolCookies);
	}
	
	// cafe methods for the driver to use
	public void printGreeting() {
		System.out.println(this.greeting);
	}
	
	public void printMenu() {
		for (Products i : menu) {
			System.out.println(i.getItemNo() + " " + i.getName() + "...$" + i.getPrice());
		}
	}

}
