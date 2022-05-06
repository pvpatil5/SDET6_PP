package com.github.pac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Anusha {
	@Test
	public void myntra() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("http://myntra.in");
		System.out.println(driver.getTitle());
	}
}

