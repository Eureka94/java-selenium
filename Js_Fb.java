package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Fb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement login = driver.findElement(By.xpath("//a[text()='Log in']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", login);
		WebElement mail= driver.findElement(By.xpath("//input[@id='email'] "));
		js.executeScript("arguments[0].scrollIntoView()", mail);
		js.executeScript("arguments[0].value='eureka'", mail);
		Thread.sleep(3000);
		js.executeScript("arguments[0].setAttribute('style','color:violet')", mail);
//		js.executeScript("arguments[0].scrollIntoView()", login);
//		js.executeScript("arguments[0].click()", login);

	}

}
