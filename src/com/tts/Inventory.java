package com.tts;

import java.util.List;
import java.util.ArrayList;

//Add a type parameter to the Inventory class to say that it works with a generic type
public class Inventory<T> {

//Define a list instance variable that takes a generic type parameter 
	private List<T> inventory;

//Define a public constructor with no parameters that sets the list instance variable to an empty list
//(you can choose the type of list you want)
	public Inventory() {
		this.inventory = new ArrayList<>();
	}

//Define a function that returns all items in the list instance variable
	public List<T> getInventory() {
		return this.inventory;
	}

//Define a function that takes an item of any type as input and adds it to the list
	public void addItem(T item) {
		this.inventory.add(item);
	}
	
//Define a function that takes an item of any type as input, removes it from the list, and then returns 
//the updated list
	public List<T> removeItem(T item) {
		
		this.inventory.remove(item);
		
		return this.inventory;
	}

//Define a function that returns the number of items currently in the list
	public int getSize() {
		return this.inventory.size();
	}

}