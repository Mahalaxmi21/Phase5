import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import web.DbUtil;

public class WebSelTest {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	System.setProperty("webdriver.chrome.driver","F:\\selinieum\\95\\chrome\\chromedriver.exe");
	WebDriver wd=new ChromeDriver();
	wd.manage().window().maximize();
	wd.get("http://localhost:8080/web/register.html");
	//testing need to be done -UI and DB
	
	//UI Level
	String expectedname="vivek";
	String expectedemail="vivek@g.c";
	
	wd.findElement(By.name("user")).sendKeys(expectedname);
	wd.findElement(By.name("email")).sendKeys(expectedemail);
	wd.findElement(By.name("submit")).submit();
	String expected="Insertion done successfully";
	String actual=wd.findElement(By.name("h1")).getText();
	if(actual.equals(expected)) {
		System.out.println("the ui level test cases are passed and inserted with "+ expectedname+"  "+expectedemail+"as the data");
	}
	
	//db level
	String sql="select * from Register";
	Connection con=DbUtil.dbConnection();
	PreparedStatement ps=con.prepareStatement(sql);
	ResultSet rs=ps.executeQuery();
	String actualuser="";
	String actualemail="";
	while(rs.next()) {
		actualuser=rs.getString(1);
		actualemail=rs.getString(2);
		
	}
	
	if(actualuser.equals(expectedname)&&actualemail.equals(expectedemail)) {
System.out.println("the db level test case of the data is passed ");		
	}
	
	
	
	wd.close();
}
}


