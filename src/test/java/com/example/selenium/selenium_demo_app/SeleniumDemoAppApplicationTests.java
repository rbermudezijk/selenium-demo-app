package com.example.selenium.selenium_demo_app;

import org.testng.TestNG;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

class SeleniumDemoAppApplicationTests extends TestNG {

	@Test
	void contextLoads() throws InterruptedException {
		System.out.println("Context load test test test test");
		// Optional. If not specified, WebDriver searches the PATH for chromedriver.
        // System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/"); 
        Thread.sleep(5000);  // Let the user actually see something!
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("ChromeDriver");
        searchBox.submit(); 
        Thread.sleep(5000);  // Let the user actually see something!
        driver.quit();  
	}
}
