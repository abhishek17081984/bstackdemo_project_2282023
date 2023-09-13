package com.bstackdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		Thread.sleep(2000);
		
		
		for (int i =0; i <3; i++) {
			driver.findElement(By.cssSelector("input[value='Apple']")).click();
			Thread.sleep(2000);
				
			
			
			//driver.findElement(By.cssSelector("button[value='1']")).click();
		}
		
	}

}
