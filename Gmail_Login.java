package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		//link load
		driver.get("https://www.amazon.in/");
		//select product
		WebElement type = driver.findElement(By.xpath("//input[@autocomplete='off']"));
		type.sendKeys("office chair");
		//click the search button
		WebElement Button = driver.findElement(By.xpath("//input[@type='submit']"));
		Button.click();
		//searching particular material
		WebElement search = driver.findElement(By.xpath("(//span[contains(text(),'Solimo ')])[1]"));
		search.click();
		System.out.println("hai");
		//printing particular material name in output screen
		WebElement dress = driver.findElement(By.xpath("(//span[contains(text(),'Solimo ')])[1]"));
		String text = dress.getText();
		System.out.println(text);
		
	
		

	}

}
