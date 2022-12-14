package com.selenium.concept;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement type = driver.findElement(By.xpath("//input[@type='text']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='baby dress for girls'", type);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		js.executeScript("arguments[0].click()", submit);
		WebElement dress = driver.findElement(By.xpath("(//span[contains(text(),'Full Sleeve')])[1]"));
		js.executeScript("arguments[0].click()", dress);
		String P_Id = driver.getWindowHandle();
		System.out.println(P_Id);
		Set<String> all_Id = driver.getWindowHandles();
		for (String Id : all_Id) {
			System.out.println(Id);
			if (Id.equals(P_Id)) {
				continue;
				
			}else {
				driver.switchTo().window(Id);
				System.out.println(driver.getCurrentUrl());
			}
		}

	}

}
