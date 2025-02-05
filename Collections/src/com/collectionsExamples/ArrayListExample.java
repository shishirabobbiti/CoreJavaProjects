package com.collectionsExamples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Cart {
	
	List<String> cart;
	
	public Cart() {
		cart=new ArrayList<String>();
	}
	
	public void addItem(String itemName) {
		if(cart.contains(itemName) || itemName.equals(null)) {
			System.out.println("Item already exists or input is null");
		}
		else
			cart.add(itemName);
	}
	
	public void itemsInCart() {
		Iterator<String> iterator = cart.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
	public void removeItem(int index) {
		cart.remove(index);
	}
	
	
}

public class ArrayListExample {

	public static void main(String[] args) {
		
		Cart c=new Cart();
		c.addItem("Jeans");
		c.addItem("Top");
		c.itemsInCart();
		System.out.println("******************");
		c.addItem("Jeans");
		c.itemsInCart();
		System.out.println("******************");
		c.addItem(null);
		c.itemsInCart();
		System.out.println("******************");
		//c.removeItem(3);
		c.itemsInCart();
		System.out.println("******************");
	}

}
