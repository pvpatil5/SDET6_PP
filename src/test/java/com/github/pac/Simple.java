package com.github.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple {
	@Test
	public static void flipkart() {
	
		
			System.setProperty("webdriver.chrome.driver","D:\\KCSM12\\Automation\\Drivers\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");

	}
	}

