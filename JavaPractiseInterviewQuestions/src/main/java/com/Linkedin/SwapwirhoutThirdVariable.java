package com.Linkedin;

public class SwapwirhoutThirdVariable {

	public static void main(String[] args) {
      int x=10;
      int y=5;
      //using third variable
      int t=x;
      x=y;
      y=t;
      System.out.println("x is:"+x);
      System.out.println("y is:"+y);
      int a=15;
      int b=20;
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("a is:"+a);
      System.out.println("b is:"+b);
	}

}
