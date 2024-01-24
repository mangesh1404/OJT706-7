package com.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadEx {

	@Test
	public void test01() throws Exception {
		System.setProperty("webdriver.chrome.driver", "chromedriverAutoIT.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/playground/file-upload");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("file")).click();
		
		Thread.sleep(3000);
		
		Runtime.getRuntime().exec("D:\\AutoIT\\FileUpload.exe");
		
	}
	
}
