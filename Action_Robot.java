package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Robot {
	public static WebDriver driver;

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		WebElement onlinecourses = driver.findElement(By.xpath("//a[text()='Online Courses']"));
		Actions a = new Actions(driver);
		a.moveToElement(onlinecourses).build().perform();
		WebElement ST = driver.findElement(By.xpath("//span[text()='Software Testing']"));
		a.moveToElement(ST).build().perform();
		a.click().build().perform();
		Robot r = new Robot();
		WebElement CT = driver.findElement(By.xpath("(//a[text()='Corporate Training'])[1]"));
		a.contextClick(CT).build().perform();
		down();
		down();
		down();
		enter();

	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
