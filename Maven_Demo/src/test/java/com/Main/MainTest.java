package com.Main;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import Browser.BrowserConfiguration;
import Model.DownloadReceipt;
import Model.LogingPage;
import Model.OpenCart;
import Model.ShippingAddress;
import Model.SideManu;
import Model.UpsideManu;

public class MainTest {

	WebDriver driver=null;
	LogingPage lp=null;
	SideManu s1=null;
	OpenCart O1=null;
	ShippingAddress sh1=null;
	DownloadReceipt Do1=null;
	UpsideManu Up1=null;
	
	@BeforeClass
	public void loadBrowser() throws InterruptedException 
	{
		driver=new BrowserConfiguration().
				ChromeBrowserSelection
				("chrome","https://bstackdemo.com/signin");
		driver.manage().window().maximize();
		Thread.sleep(3000);		
	}
	
	@BeforeTest()
	public void befrotest() {
		lp=new LogingPage(); 
		s1=new SideManu();
		O1=new OpenCart();
		sh1=new ShippingAddress();
		Do1=new DownloadReceipt();
		Up1=new UpsideManu();
		
	}
	
	
	@Test(priority = 0)
	public void longingDetils() throws InterruptedException {
		
		lp.enterUsername(driver);
		lp.enterPassword(driver);
		lp.clickLoging(driver);
		}
	@Test(priority = 1)
	public void sideMenu() throws InterruptedException {
		s1.clickapple(driver);
		s1.Samsung(driver);
		s1.Google_cart(driver);
		s1.OnePlus(driver);
		s1.AddToFavourites(driver);
		
	}
	@Test(priority = 2)
	public void OpenCart() throws InterruptedException {
        O1.float_cart_open(driver);
		O1.AddChangeProductButton(driver);
        O1.checkout(driver);

	}
	@Test(priority = 3)
	public void ShippingAddress() throws InterruptedException {
		sh1.FirstName(driver, "abhishek");
		sh1.LastName(driver, "sonar");
		sh1.Adress(driver, "xyzsdvmelmevmerm");
		sh1.city(driver,"surat");
		sh1.postcode(driver,"950053");
		sh1.submitbutton(driver);
	}
	@Test(priority = 4)
	public void DownloadReceipt() throws InterruptedException {
	Do1.DownloadOrderReceipt(driver);
	Do1.BackToHomePage(driver);
		
	}
	
	@Test(priority = 5)
	public void UpsideManu() throws InterruptedException {
		Up1.Offers(driver);
		Up1.Orders(driver);
		Up1.Favourites(driver);
		Up1.logout(driver);
		Up1.Orderby(driver);
		
	}
	
	
	@AfterClass
	public void CloseBrowser() throws InterruptedException {
		System.out.println("bye bye");
		Thread.sleep(3000);
		driver.close();
		
	}
	
}
