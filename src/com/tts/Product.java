package com.tts;

import java.util.List;

public class Product {
	//define the instance variables for 'name' and 'price'
	private String name;
	private int price;

	//define a public constructor for Product that takes a name and price as input and sets the instance variables accordingly
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	

	public static void main(String[] args) {
		//Make an Inventory object that holds Products
		Inventory<Product> inventory = new Inventory<Product>();

		//Add as many products as you want to your Inventory Object using the addItem() method you defined 
		Product p1 = new Product("phone", 100);
		Product p2 = new Product("laptop", 1000);
		Product p3 = new Product("TV", 800);
		Product p4 = new Product("car", 5000);
		Product p5 = new Product("CD", 50);
		
		inventory.addItem(p1);
		inventory.addItem(p2);
		inventory.addItem(p3);
		inventory.addItem(p4);
		inventory.addItem(p5);
		

		//Your task is to calculate the total price of all products in an Inventory object called myInventory. Follow these steps:
		//1. Call the getItems method on your inventory object to retrieve the list of all products.
		//2. Convert this list into a stream by calling the stream method.
		//3. Apply the mapToDouble operation to this stream. The operation should be applied to each Product object 
		//	 	in the stream, converting it into its price. Use the lambda expression product -> product.price to 
		//		perform this conversion. This expression means "for each product, return its price".
		//4. Apply the sum operation to the stream to get the total price of all products.
		//5. Store this total price in a double variable called priceTotal.
		//6. Print out priceTotal to the console to make sure you are properly summing your Products!
		List<Product> list = inventory.getInventory();
		
		double priceTotal = list.stream().mapToDouble(product -> product.price).sum();
		System.out.println(priceTotal);
		
		//Helpful documentation:
		//https://www.baeldung.com/java-stream-sum#using-streamsum-with-objects

	}

}