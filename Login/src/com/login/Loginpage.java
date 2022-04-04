package com.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Loginpage {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\\\Phase-5\\\\selinieum\\\\95\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		//wd.get("https://www.simplilearn.com/");
		wd.get("F:\\Phase-5\\hi.html");
		Select sc=new Select(wd.findElement(By.name("sub")));
		sc.selectByValue("java");
		
		List<WebElement> list=sc.getOptions();
		for(WebElement we:list) {
			System.out.println(we.getText());
		}
		
	}

}