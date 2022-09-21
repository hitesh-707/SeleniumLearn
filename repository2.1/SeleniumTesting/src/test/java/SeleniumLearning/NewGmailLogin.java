package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewGmailLogin {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		WebElement search= driver.findElement(By.name("identifier"));
		search.sendKeys("doneladio786@gmail.com");
		//driver.findElement(By.linkText("Learn more")).click();
	
	 	driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();

	}

}
