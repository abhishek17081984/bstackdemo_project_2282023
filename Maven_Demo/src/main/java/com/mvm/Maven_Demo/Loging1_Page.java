package com.mvm.Maven_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Loging1_Page {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\abhi1\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://bstackdemo.com/");
		Thread.sleep(2000);
		//driver.close();
		
		driver.findElement(By.id("signin")).click();
		Thread.sleep(2000);
		
		//Select select=new Select(driver.findElement(By.id("fruits")));
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div[1]")).sendKeys("demouser");
		Thread.sleep(2000);
		
		
		
			
		}
		
		
		
		
		
		
		
		
		
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[1]/div/div[1]/div[1]")).sendKeys("demouser");
		//Thread.sleep(2000);
		
		
		
		//driver.findElement(By.xpath("/html/body/div/div[2]/div/form/div[2]/div[2]/div/div[1]/div[1]")).sendKeys("testingisfun99");
	//Thread.sleep(2000);
		
		
		//driver.findElement(By.id("username")).sendKeys("demouser");
		//driver.findElement(By.id("password")).sendKeys("testingisfun99");
		//Thread.sleep(2000);
		
		//driver.findElement(By.id("login-btn")).click();
		//Thread.sleep(2000);
		
	//	driver.close();
		
	}

