package com.cart;

import com.item.Item;

public interface ICart {
	public void addItem(Item item);
	public void displayItems();
	public int totalAmount();
	public void removeItem(String removeProduct);

}
