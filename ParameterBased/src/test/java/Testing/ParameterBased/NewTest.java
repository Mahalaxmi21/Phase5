package Testing.ParameterBased;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class NewTest {
	 WebDriver wd;
	 @Parameters("browser")
	 @BeforeTest
	 public void inti(String browser) {
		 
		 switch(browser) {
		 case "chrome":WebDriverManager.chromedriver().setup();
		 				wd=new ChromeDriver();
		 				break;
		 case "firefox":WebDriverManager.firefoxdriver().setup();	 
		 				wd=new FirefoxDriver();
		 				break;
		 }
		 
		 wd.manage().window().maximize();
	 }

@Parameters("url1")
  @Test
  public void test1(String url1) {
	  
	//	wd.get("https://www.google.co.in/");
	  wd.get(url1);
  
  }
  
@Parameters("url2")
  @Test
  public void test2(String url2) {
		//wd.get("https://www.amazon.in/");
	  wd.get(url2);
	  
  }
  
  @AfterTest
  public void closing() {
	  wd.close();
  }
  
  
}
