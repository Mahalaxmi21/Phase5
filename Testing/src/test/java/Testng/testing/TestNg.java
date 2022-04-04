package Testng.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


//sel->drivers ->generalized->maven->pom.xml
public class TestNg {
  @Test
  public void test1() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.co.in/");
		wd.close();
	  
  }
  
  @Test
  public void test2() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		wd.close();
	  
  }
  
  
}
