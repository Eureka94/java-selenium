package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='kurta set for women'", search);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].setAttribute('style','color:red')", search);
		js.executeScript("arguments[0].click()", submit);
		Thread.sleep(2000);
		WebElement drees = driver.findElement(By.xpath("//span[text()='FIORRA'] "));
		
		js.executeScript("arguments[0].scrollIntoView()", drees);
		//Thread.sleep(3000);
		js.executeScript("arguments[0].click()", drees);

	}

}
