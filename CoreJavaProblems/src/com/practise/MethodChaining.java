package com.practise;
interface WebDriver{
		public WebElement findElement();
}

class ChromeDriver implements WebDriver{
		public ChromeDriver(){
			System.out.println("Chrome browser is opened");
		}
	
		public WebElement findElement(){
			WebElement we=new WebElement();
			return we;
		}
		
}
class FirefoxDriver implements WebDriver{
		public FirefoxDriver(){
			System.out.println("Firefox browser is opened");
		}
	
		public WebElement findElement(){
			WebElement we=new WebElement();
			return we;
		}
		
}

class WebElement{

	public void click(){
	
		System.out.println("Click operation successful");
	}


}


public class MethodChaining{

		public static void main(String[] args){
			WebDriver driver=new ChromeDriver();
			WebElement we=driver.findElement();
			we.click();


              }
}