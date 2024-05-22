package testDeclaration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	WebDriver driver;

	@Test
	public void launchBrowser() {

		// initiate browser
		driver = new ChromeDriver();

		// open url
		driver.get("https://www.amazon.in/");
		
		System.out.println("url launched");

	}

	@AfterTest
	public void closeBrowser() {
		// close current window
		driver.close();
	}

}
