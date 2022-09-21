package SeleniumLearning;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FireFoxSetUp {
public static void main(String[]args) {
	WebDriverManager.firefoxdriver().setup();
	FirefoxDriver drive = new FirefoxDriver();
	drive.get("https://metrolink.co.in/#/");
}
}
