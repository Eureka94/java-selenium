package com.selenium.concept;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WIPRO\\eclipse-workspace\\Maven_Project\\driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("kayalvizhi.de@gmail.com");
		WebElement pwd = driver.findElement(By.name("pass"));
		pwd.sendKeys("dinaeureka");
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des=new File("C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\screenshot\\Snap1.png");
		
		FileUtils.copyFile(src, des);
		

	}

}
