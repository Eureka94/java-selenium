package com.selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("chrome browser launched successfully");
		
		
	}

}
