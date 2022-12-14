package com.selenium.concept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods_Launch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
//		System.out.println("url launched successfully");
//		String title = driver.getTitle();
//		System.out.println("current title:"+title);
//		String currentUrl = driver.getCurrentUrl();
//		System.out.println("current url:"+currentUrl);
		driver.navigate().to("https://www.youtube.com/watch?v=AVMp22B16iw");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		System.out.println("cleared all cookies");
		driver.manage().window().fullscreen();
		driver.manage().window().minimize();
		

	}

}
