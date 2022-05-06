package com.github.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart 
{
	public class flipkart {
		@Test
		public void amazon() {
			WebDriverManager.chromedriver().setup();
			WebDriver	driver = new ChromeDriver();
			driver.get("http://flipkart.in");
			System.out.println(driver.getTitle());
		}
	}
}
