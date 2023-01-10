package bhim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sample5 {

	WebDriver driver = null; 

	@BeforeMethod
	public void launchApp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://snapchat.com/");

		Thread.sleep(3000);

	}

	@Test
	public void click_button() {

		driver.findElement(By.linkText("About")).click();
	}

	
	@Test
	public void click_all() throws InterruptedException {
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='button button-regular button-flat css-g4xqdm']")).click();
		
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void closeApp() {

		driver.quit();
	}
}

