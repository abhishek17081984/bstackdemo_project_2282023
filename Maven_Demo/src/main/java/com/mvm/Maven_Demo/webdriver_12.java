package com.mvm.Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webdriver_12 {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.webdrivre","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		
		
		//driver.close();
		
	}

}
