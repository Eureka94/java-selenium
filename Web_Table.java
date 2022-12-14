package com.selenium.concept;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\WIPRO\\eclipse-workspace\\selenium\\driver\\chromedriver (1).exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://qavbox.github.io/demo/webtable/");
		driver.manage().window().maximize();
		//finding oneword
		System.out.println("Finding one word");
		System.out.println("_________________");
		WebElement oneword = driver.findElement(By.xpath("//table[@id='table02']/tbody/tr[4]/td[2]"));
		String text = oneword.getText();
		System.out.println(text);
		System.out.println("                ");
		System.out.println("Getting one row");
		System.out.println("_________________");
		List<WebElement> onerow = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[1]"));
		for (WebElement all : onerow) {
			System.out.println(all.getText());
			}
		System.out.println("                 ");
		System.out.println("Getting 4th row");
		System.out.println("_________________");
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[4]/td"));
		for (WebElement all2 : row) {
			System.out.println(all2.getText());
			
		}
		System.out.println("                 ");
		System.out.println("Finding 55th row 3rd column element");
		System.out.println("_________________");
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='table02']/tbody/tr[55]/td[3]"));
		for (WebElement all3 : col) {
			System.out.println(all3.getText());
			
			
		}
		
		
		
		

	}

}
