package com.github.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rajkumar 
{
	public static void main(String[] args) 
	{			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://facebook.com");
			System.out.println(driver.getTitle());
			
			
		
	}
}
