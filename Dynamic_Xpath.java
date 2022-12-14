package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("hai");
//		WebElement Mob = driver.findElement(By.xpath("//a[text()='Mobiles']"));
//		Mob.click();
//		WebElement MobtoCs = driver.findElement(By.xpath("//a[text()='Mobiles']//following-sibling::a[text()='Customer Service']"));
//		MobtoCs.click();
//		WebElement CstoBS = driver.findElement(By.xpath("//a[text()='Customer Service']//preceding-sibling::a[text()='Best Sellers']"));
//		CstoBS.click();
//		System.out.println("Executing Dynamic Xpath");

	}

}
