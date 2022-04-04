package Testng.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;


//sel->drivers ->generalized->maven->pom.xml
public class Hardseet {
  @Test
  public void test1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
		String title=wd.getTitle();
		SoftAssert sa=new SoftAssert();
		sa.assertEquals("Googl",title,"title not matched");
		System.out.println("done");
		sa.assertEquals("https://www.google.co.in/",wd.getCurrentUrl(),"url not found");
		sa.assertAll();
		wd.close();
	  
  }
  
//  @Test
//  public void test2() {
//	  WebDriverManager.chromedriver().setup();
//	  WebDriver wd=new ChromeDriver();
//		wd.manage().window().maximize();
//		wd.get("https://www.amazon.in/");
//		wd.close();
//	  
//  }
  
  
}
