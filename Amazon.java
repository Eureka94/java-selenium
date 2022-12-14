package com.selenium.concept;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        WebElement All = driver.findElement(By.id("searchDropdownBox"));
        All.sendKeys("clothing and accessories");
        WebElement type = driver.findElement(By.id("twotabsearchtextbox"));
        type.sendKeys("kurta set for women");
        String attribute = type.getAttribute("id");
        System.out.println(attribute);
        boolean displayed = type.isDisplayed();
        System.out.println(displayed);
        String tagName = type.getTagName();
        System.out.println(tagName);
        String text = type.getText();
        System.out.println(text);
        String att2 = type.getAttribute("value");
        System.out.println(att2);
        boolean enabled = type.isEnabled();
        System.out.println(enabled);
	}

}
