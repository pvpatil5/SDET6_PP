package com.github.pac;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Vtiger {

	@Test
	public void vtigerlogin() {
		WebDriverManager.chromedriver().setup();
		WebDriver	driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		WebElement un=driver.findElement(By.name("user_name"));

		un.sendKeys("admin");

		WebElement pwd=driver.findElement(By.name("user_password"));

		pwd.sendKeys("12345");

		WebElement loginbtn=driver.findElement(By.id("submitButton"));

		loginbtn.click();
		System.out.println(driver.getTitle());


	}
}
