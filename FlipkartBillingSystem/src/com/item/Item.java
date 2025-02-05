package com.item;

public class Item {
	  	
      private String name;
      private int price;
      private int quantity;
       
      public void setName(String name) {
    	  this.name=name;
      }
      public String getName() {
		return name;
    	  }
      public void setPrice(int price) {
    	  this.price=price;
      }
      public int getPrice() {
    	  return price;
      }
      public void setQuantity(int quantity) {
    	  this.quantity=quantity;
      }
      public int getQuantity() {
    	  return quantity;
      }
      public Item() {
     }
      public Item(String name,int price,int quantity) {
    	  this.name=name;
    	  this.price=price;
    	  this.quantity=quantity;
     }
	@Override
	public String toString() {
		return "Item [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
     
}
