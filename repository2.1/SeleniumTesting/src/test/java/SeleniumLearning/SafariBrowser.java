package SeleniumLearning;

import org.openqa.selenium.safari.SafariDriver;

public class SafariBrowser {

	public static void main(String[] args) {
		
		SafariDriver driver = new SafariDriver();
		driver.get("https://metrolink.co.in/");
	}

}
