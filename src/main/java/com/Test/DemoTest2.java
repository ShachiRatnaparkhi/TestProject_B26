package com.Test;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest2 {


	@Test
	public void TC006(){
	System.setProperty("webdriver.chrome.driver",
      "C:\\Users\\Admin\\Desktop\\sample\\TestProject_B26\\src\\main\\java\\com\\Test\\DemoTest2.java");
	WebDriver driver = (WebDriver) new ChromeDriver();
	((WebDriver) driver).get("https://automationexercise.com/");
	driver.manage().window().maximize();
	
}
}