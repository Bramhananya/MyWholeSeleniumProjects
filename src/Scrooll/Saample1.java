package Scrooll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saample1 {
	
		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.navigate().refresh();
			driver.get("http://Google.com");
			
			 
			JavascriptExecutor  js = (JavascriptExecutor)driver;
		   WebElement	input = driver.findElement(By.name("q"));
		   
		   js.executeScript("arguments[0].value='Noora fatehi Hot Pics ' ", input);
		   driver.navigate().refresh();
		   System.out.println("Page is refreshed properly........");
		   	   
		   Thread.sleep(3000);
		   System.out.println("Test case is passed................");
		   
		   driver.quit();
			
		}
}
