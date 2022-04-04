package Testng.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data{

	
	@Test(dataProvider = "dp")
  public void test(String url, String data) {
		WebDriverManager.chromedriver().setup();
		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get(url);
		wd.findElement(By.name("q")).sendKeys(data);
		wd.findElement(By.name("btnK")).submit();
		wd.quit();
  }

 
  
  
  
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"https://www.google.co.in/","amazon" },
      new Object[] {"https://www.google.co.in/","simplilearn"  },
    };
  }
}

