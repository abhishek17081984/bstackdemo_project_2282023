package com.mvm.Maven_Demo;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Junit_Webdriver {
	
	WebDriver driver=null;
	@Test
	public void test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
	    Thread.sleep(2000);
	
	    driver.findElement(By.id("login-button")).click();
	    Thread.sleep(2000);
	    driver.close();
		

		Alert a1=driver.switchTo().alert();
		System.out.println("first alert message"+a1.getText());
		a1.accept();
		//a1.dismiss();
		
		Thread.sleep(2000);
		
		Alert a2Alert=driver.switchTo().alert();
		System.out.println("second alert message: "+a2Alert.getText());
		a2Alert.accept();
	Thread.sleep(2000);
	
		
	}
}
