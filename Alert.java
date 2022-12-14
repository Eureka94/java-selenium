package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//simple
		WebElement simple = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
		simple.click();
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		alert.accept();
		//confirmation
		WebElement OC = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
		OC.click();
		WebElement conf = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		conf.click();
		org.openqa.selenium.Alert alert2 = driver.switchTo().alert();
		alert2.accept();
		//prompt
		WebElement text = driver.findElement(By.xpath("//a[text()='Alert with Textbox ']"));
		text.click();
		WebElement OK = driver.findElement(By.xpath("//button[contains(text(),'demonstrate ')]"));
		OK.click();
		org.openqa.selenium.Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Prompt alert");
		alert3.accept();
		System.out.println("successfully execute the alert program");
		
	     

	}

}
