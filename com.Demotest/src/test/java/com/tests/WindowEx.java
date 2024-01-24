package com.tests;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowEx {

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/LENOVO/Downloads/Offline%20Website/index.html");
		driver.findElement(By.id("email")).sendKeys("kiran@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//a[text()='More info ']"));
		String mainWin = driver.getWindowHandle();
		for(WebElement element : links) 
			element.click();
		Set<String> allWins = driver.getWindowHandles();// 5 values
		
		for(String win : allWins) {
			System.out.println("handle of a window is:  "+win);
			if(!win.equals(mainWin)) {
				driver.switchTo().window(win);// 4 times
				System.out.println(driver.getCurrentUrl());
				Thread.sleep(3000);
				driver.close();	
			}
		}
	}
	
}