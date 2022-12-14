package com.selenium.concept;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Multiple_Window {
      public  static WebDriver driver;
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
	     driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement TV = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		right_Click(TV);
		down();
		enter();
		WebElement kitchen = driver.findElement(By.xpath("//a[contains(text(),'Kitchen')]"));
		right_Click(kitchen);
		down();
		enter();
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		right_Click(fashion);
		down();
		enter();
	    url();
	    click();
        
		
	}
    public static void right_Click(WebElement element) {
		Actions a=new Actions(driver); 
		a.contextClick(element).build().perform();

	}
    public static void down() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);

	}
    public static void enter() throws AWTException {
    	Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}
    public static void url() {
    	 String expected_Url="https://www.amazon.in/gp/browse.html?node=6648217031&ref_=nav_cs_fashion";
		String single = driver.getWindowHandle();
		System.out.println(single);
		Set<String> all = driver.getWindowHandles();
		System.out.println(all);
		for (String id : all) {
			if (driver.switchTo().window(id).getCurrentUrl().equals(expected_Url)) {
				String title = driver.getTitle();
				System.out.println(title);
				break;
				
			}
			
		}

	}
    public static void click() {
		Actions a=new Actions(driver);
		WebElement click = driver.findElement(By.xpath("//span[text()='Winter wear']"));
		a.click(click).build().perform();
		System.out.println("successfully click the winter wear");

	}

}
