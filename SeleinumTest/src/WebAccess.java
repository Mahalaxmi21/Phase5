import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebAccess {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\\\Phase-5\\\\selinieum\\\\95\\\\chromedriver_win32\\\\chromedriver.exe");

		WebDriver wd=new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.amazon.in/");
		System.out.println(wd.getTitle());
		System.out.println(wd.getCurrentUrl());



		wd.findElement(By.linkText("Start here.")).click();

		wd.findElement(By.id("ap_customer_name")).sendKeys("Mahalaxmi");

		wd.findElement(By.id("ap_phone_number")).sendKeys("9874563210");

		wd.findElement(By.id("ap_email")).sendKeys("Mahi@gmail.com");

		wd.findElement(By.id("ap_password")).sendKeys("12345678");

		wd.findElement(By.id("continue")).click();


		Thread.sleep(20000);


		wd.close();

		
	}
}
