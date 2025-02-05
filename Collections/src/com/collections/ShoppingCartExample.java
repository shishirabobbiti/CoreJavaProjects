package com.collections;

import java.util.ArrayList;

class ShoppingCart {
    private ArrayList<String> cart; // ArrayList to store items

    // Constructor
    public ShoppingCart() {
        cart = new ArrayList<>();
    }

    // Add an item to the cart
    public void addItem(String item) {
        cart.add(item);
        System.out.println(item + " has been added to your cart.");
    }

    // Remove an item from the cart
    public void removeItem(String item) {
        if (cart.remove(item)) {
            System.out.println(item + " has been removed from your cart.");
        } else {
            System.out.println(item + " is not in your cart.");
        }
    }

    // View all items in the cart
    public void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Items in your cart: " + cart);
        }
    }

    // Check if an item is in the cart
    public void checkItem(String item) {
        if (cart.contains(item)) {
            System.out.println(item + " is in your cart.");
        } else {
            System.out.println(item + " is not in your cart.");
        }
    }

    // Get the total number of items
    public void totalItems() {
        System.out.println("Total items in your cart: " + cart.size());
    }
}

public class ShoppingCartExample {
    public static void main(String[] args) {
        ShoppingCart myCart = new ShoppingCart();

        // Adding items
        myCart.addItem("Laptop");
        myCart.addItem("Smartphone");
        myCart.addItem("Headphones");

        // Viewing the cart
        myCart.viewCart();

        // Checking for a specific item
        myCart.checkItem("Smartphone");
        myCart.checkItem("Tablet");

        // Removing an item
        myCart.removeItem("Headphones");
        myCart.viewCart();

        // Total items in the cart
        myCart.totalItems();
    }
}

