package com.shopping;

import java.util.Scanner;

import com.cart.Cart;
import com.item.Item;

public class Shopping {

	public static void main(String[] args) {
		Cart cart=new Cart();
		Scanner sc=new Scanner(System.in);
		boolean b=true;
		while(b) {
			System.out.println("1.additems"+"\n"+"2.Displayitems"+"\n"+"3.Display totalamount"+"\n"+"4.Remove item"+"\n"+"5.Exit"+"\n"+"Please select choice");
			int choice=sc.nextInt();	
			if(choice==1) {
				System.out.println("Enter Product name");
				String productName=sc.next();
				System.out.println("Enter Product price");
				int productPrice=sc.nextInt();
				System.out.println("Enter Product quantity");
				int productQuantity=sc.nextInt();
			Item item=new Item(productName,productPrice,productQuantity);	
			cart.addItem(item);
			System.out.println("Item added successfully");
			}
			else if(choice==2){
				System.out.println("Items in Cart::");
			cart.displayItems();
			}
			else if(choice==3){
			int totalAmount=cart.totalAmount();
			System.out.println("total=" + totalAmount);
			}
			else if(choice==4) {
				System.out.println("Enter Product name");
				String removeProductName=sc.next();
				cart.removeItem(removeProductName);
				System.out.println("Item removed successfully");
			}
			else if(choice==5) {
				b=false;
			}
			else
				System.out.println("Invalid Choice");
			
		}
	}

}
