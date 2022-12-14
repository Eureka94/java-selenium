package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
	    driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		//single_Frame();
		multi_Frame();

	}
	public static void single_Frame() {
	WebElement Sing = driver.findElement(By.xpath("//a[text()='Single Iframe ']"));
	Sing.click();
	driver.switchTo().frame("SingleFrame");
	WebElement text = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	text.sendKeys("kayal");

	}
   public static void multi_Frame() {
	WebElement bt1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
	bt1.click();
	WebElement mv1 = driver.findElement(By.xpath("(//iframe[contains(@style,'600px')])[2]"));
	driver.switchTo().frame(mv1);
	System.out.println("hai");
	WebElement mv2 = driver.findElement(By.xpath("//iframe[contains(@style,'400px')]"));
	driver.switchTo().frame(mv2);
	WebElement text1 = driver.findElement(By.xpath("//input[@type='text']"));
	text1.sendKeys("vizhi");
	driver.switchTo().defaultContent();
	WebElement video = driver.findElement(By.xpath("//a[text()='Video']"));
	video.click();
	WebElement youtupe = driver.findElement(By.xpath("//a[text()='Youtube']"));
	youtupe.click();

}
}
