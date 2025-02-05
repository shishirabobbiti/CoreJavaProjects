package com.cart;

import java.util.ArrayList;

import com.item.Item;

public class Cart implements ICart {
	ArrayList<Item> al;
	public Cart() {
		al=new ArrayList<Item>();
	}
	public void addItem(Item item) {
		al.add(item);
			
	}
	public void displayItems() {
		if(al.isEmpty()) {
			System.out.println("cart is empty please add items");
		}
		else {
		for(int i=0;i<al.size();i++) {
			Item item= al.get(i);
			System.out.println(item);
		}
		}
	}
	public void removeItem(String removeProductName) {
		if(al.isEmpty()) {
			System.out.println("cart is empty unable to remove items");
		}
		else {
		for(int i=0;i<al.size();i++) {
			String itemName= al.get(i).getName();
			if(itemName.equals(removeProductName)) {
				al.remove(i);
			}
		}
		}
		
		
	}
	public int totalAmount() {
		int totalAmount=0;
		if(al.isEmpty()) {
			totalAmount=0;
		}
		else {
		for(int i=0;i<al.size();i++) {
			int price=al.get(i).getPrice();
			int quantity=al.get(i).getQuantity();
			totalAmount+=price*quantity;
			}
		}
		return totalAmount;
	}
}
