package com.selenium.concept;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropface_Waitfn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/login/");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));// page LoadTimeOut
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit Wait
		
		driver.manage().window().maximize();
		WebElement CA = driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		CA.click();
		WebElement FN = driver.findElement(By.xpath("//input[@name='firstname']"));
		FN.sendKeys("abcd");
		WebElement LN = driver.findElement(By.xpath("//input[@name='lastname']"));
		LN.sendKeys("S");
		WebElement mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mobile.sendKeys("123456789");
		WebElement NPW = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		NPW.sendKeys("RoyalEnfield");
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s = new Select(day);
		s.selectByIndex(11);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s1 = new Select(month);
		s1.selectByVisibleText("Sep");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s2 = new Select(year);
		s2.selectByValue("1994");
		WebElement Btn = driver.findElement(By.xpath("//label[text()='Female']"));
		Btn.click();
		System.out.println("Successfully select the options");

	}

}
