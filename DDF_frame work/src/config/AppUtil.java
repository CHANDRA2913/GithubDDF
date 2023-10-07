package config;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class AppUtil {
public static Properties conpro;
public static WebDriver driver;
@BeforeTest
public static void setup()throws Throwable
{
	conpro=new Properties();
	conpro.load(new FileInputStream("\\PropertyFile\\Enviornment.properties"));
	if(conpro.getProperty("Browser").equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
}
	else if(conpro.getProperty("Browser").equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("Browser value is not matching");
		
	}
}
@AfterTest
public static void tearDown()
{
	driver.quit();
}
}
