package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1 {
	public static String browser = "chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			WebDriverManager.chromedriver().setup();
			 driver = new FirefoxDriver();
		}
		driver.get("https://yopmail.com/en/");
		driver.manage().window().maximize();
		//@ implicitlywait che page ne 10 sec. sudhi roki rakhva mate jethi time out no problem na ave
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//fuentwait che every part ne roki rakhse time second na hisabe
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
			       .withTimeout(Duration.ofSeconds(30))
			       .pollingEvery(Duration.ofSeconds(5))
			       .withMessage("Time out as the condition is not met");
			       //@ explicity wait che perticuler code ne rokva mate
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
	//	WebElement username =driver.findElement(By.name("login"));
	//	username.sendKeys("doneladio706@gmail.com");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("login"))).sendKeys("hitesh@yopmail.com");
		driver.findElement(By.xpath("//*[@id=\"refreshbut\"]/button/i")).click();
		System.out.println(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"refreshbut\\\"]/button/i"))));
		
		
	}

}
