package com.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(com.main.MyListeners.class)
public class FirstClassInMaven {
	
	@Test
	public void testMethod1(){
		System.out.println("Test method 1 ");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		
		/*System.out.println("+++++++++++++ "+System.getProperty("env.BROWSER"));*/
		/*if(System.getProperty("env.BROWSER").equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (System.getProperty("env.BROWSER").equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}*/
	}
	/*@Test
	public void testMethod2() {
		Assert.fail();
		
	}*/
	/*@Test (dependsOnMethods = "testMethod2")
	public void testMethod3() {
		
	}*/

}
