package commonfunction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.Reporter;

import config.AppUtil;

public class FunctionalLibrary  extends AppUtil{
	public static boolean Adminlogin(String username,String password )
	{
	driver.get(conpro.getProperty("Url"));
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.findElement(By.xpath(conpro.getProperty("Objuser"))).sendKeys(username);
	driver.findElement(By.xpath(conpro.getProperty("Objpass"))).sendKeys(password);
	driver.findElement(By.xpath(conpro.getProperty("Objlogin"))).click();
	String expected ="dashboard";
	String Actual=driver.getCurrentUrl();
	if(Actual.contains(expected))
	{
		Reporter.log("login success::"+expected+"  "+Actual,true);
		return true;
	}
	else
	{
		Reporter.log("login fail::"+expected+"  "+Actual,true);
		return false;
				
	}
	}
}
