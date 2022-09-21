package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowsers {
	public static String browser= "chrome";
	public static WebDriver driver;
	
	
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver", "//Users//shrunjalmehta//Desktop//chromedriver//chromedriver");
	
	if(browser.equals("chrome"))
	{WebDriverManager.chromedriver().setup();
	 driver = new ChromeDriver();
	driver.get("https://metrolink.co.in/#/");
	}
	else if(browser.equals("firefox")) {
		WebDriverManager.chromedriver().setup();
	  driver = new FirefoxDriver();
		driver.get("https://metrolink.co.in/#/");
	}
	driver.findElement(By.linkText("Buy Fastag")).click();
	String title = driver.getTitle();
	System.out.println(title);
	System.out.println(title.length());
//	driver.quit();
	
}
}
