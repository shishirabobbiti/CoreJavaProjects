package com.inheritance;
class WebDriver{
	
	public WebDriver(){
		System.out.println("WebDriver Constructor");
	}

	public void get(){
		System.out.println("get() using WebDriver");
	}

}

class ChromeDriver extends WebDriver{

	public ChromeDriver(){
		super();
		System.out.println("ChromDriver Constructor");
	}
	
	public void get(){
		System.out.println("get() using ChromeDriver");
	}

}

class FirefoxDriver extends WebDriver{

	public FirefoxDriver(){
		super();
		System.out.println("FirefoxDriver Constructor");
	}
	
	//public void get(){
	//	System.out.println("get() using FirefoxDriver");
	//}

}


public class SeleniumDrivers{
	public static void main(String[] args){
		WebDriver driver=new ChromeDriver();
		driver.get();

		driver=new FirefoxDriver();
		driver.get();
	}
}