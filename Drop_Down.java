package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Drop_Down {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://letcode.in/dropdowns");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement hero = driver.findElement(By.xpath("//select[@id='superheros']"));
		Select s=new Select(hero);
		System.out.println("checking single or multiple");
		//checking single or multiple
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		System.out.println("************************");
		System.out.println("selecting and deselecting options");
		s.selectByIndex(5);
		s.selectByIndex(6);
		s.selectByIndex(7);
		s.selectByValue("dd");
		s.selectByVisibleText("Ghost Rider");
		s.deselectByIndex(6);
		List<WebElement> all = s.getAllSelectedOptions();
		for (WebElement webElement : all) {
			System.out.println(webElement.getText());
		}
		System.out.println("*************************");
		System.out.println("select which one is first select");
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		System.out.println("*************************");
		System.out.println("listing the options of languages");
		WebElement lang= driver.findElement(By.xpath("//select[@id='lang']"));
		Select s2 = new Select(lang);
		//
		List<WebElement> options = s2.getOptions();
		for (WebElement webElement : options) {
			System.out.println(webElement.getText());
		}
	
		}
		
		
		
		
		

	}


