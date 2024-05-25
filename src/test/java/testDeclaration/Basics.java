package testDeclaration;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Basics {
	WebDriver driver;

	@Test
	public void launchBrowser() throws IOException {

		// initiate browser
		driver = new ChromeDriver();

		// open url
		driver.get("https://www.amazon.in/");
		
		System.out.println("url launched");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File ("C:\\ScreenShot\\screenshot.png"));

	}

	@AfterTest
	public void closeBrowser() {
		// close current window
		driver.close();
	}
	
	public void clickOnElement() {
		System.out.println("Hello this is Basics class");
	}

}
