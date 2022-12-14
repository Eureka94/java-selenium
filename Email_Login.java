package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Email_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		WebElement mailid = driver.findElement(By.id("email"));
		mailid.sendKeys("kayalvizhi.de@gmail.com");
		WebElement pwd= driver.findElement(By.name("pass"));
		pwd.sendKeys("KayalMS@20");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		
		
		
		

	}

}
