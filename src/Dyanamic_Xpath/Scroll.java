package Dyanamic_Xpath;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Scroll {

	public static void main(String[]args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.navigate().to("https://Amezon.com");
		Thread.sleep(3000);


		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,300)");

		Thread.sleep(3000);
		
		// Here we can scroll the page horizontaly . 
		 java.executeScript("javascript:window.scrollBy(250,0)");

	      driver.quit();

	}

}
