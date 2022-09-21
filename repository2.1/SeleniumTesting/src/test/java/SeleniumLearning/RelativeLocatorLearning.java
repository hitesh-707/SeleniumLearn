package SeleniumLearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorLearning {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		//@above relative locator
	WebElement	above = driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.tagName("select")));
		above.sendKeys("doneladio707@gmail.com");
		//@below relative locator
		WebElement	below = driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.tagName("select")));
		below.sendKeys("ahmedabad");
		//near relative locator
		/*WebElement	near = driver.findElement(RelativeLocator.with(By.partialLinkText("ENTER TO THE TESTING WEBSITE")).near(By.linkText("Signin")));
		near.click();*/
		//right of relative locator
		WebElement rightof = driver.findElement(RelativeLocator.with(By.xpath("//*[@id=\"load_form\"]/fieldset[7]/input")).toRightOf(By.tagName("label")));
		rightof.sendKeys("123456");
		//@left of relative locator
			WebElement leftof =driver.findElement(RelativeLocator.with(By.partialLinkText("Signin")).toLeftOf(By.xpath("(//*[@id=\"load_form\"]/div[1]/div[2]/input)[2]")));
			leftof.click();
	}
}
