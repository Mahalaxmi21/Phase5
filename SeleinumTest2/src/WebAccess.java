import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebAccess {
	public static void main(String[] args) throws InterruptedException {
	//load the driver
		System.setProperty("webdriver.chrome.driver","F:\\\\Phase-5\\\\selinieum\\\\95\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver wd=new ChromeDriver();
	//maximise the web browser screen
		wd.manage().window().maximize();
		
		//webpage level time bound
		wd.manage().timeouts().pageLoadTimeout(200,TimeUnit.MILLISECONDS);
	//load the webpage
		wd.get("F:\\Phase-5\\SeleinumTest2\\insert.html");
		
		//webelements 1.implicit 2.explicit
		//wd.manage().timeouts().implicitlyWait(200, TimeUnit.MILLISECONDS);
		
		WebElement we1=wd.findElement(By.name("user"));
		WebElement we2=wd.findElement(By.name("email"));
		//userdefined method(wd,we,timebound,value)
		explicit(wd,we1,2000,"karthik");
		explicit(wd,we2,3000,"k@c.c");
		
	}

	public static void explicit(WebDriver wd, WebElement we, int timebound, String sendkeys) {
		// TODO Auto-generated method stub
		new WebDriverWait(wd, timebound).until(ExpectedConditions.visibilityOf(we));
		we.sendKeys(sendkeys);
		
	}
}
