package Is_Displayed;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com/");
		
	/*  driver.findElement(By.linkText("Create New Account")).click();
	  Thread.sleep(3000);	  */
	  if(driver.findElement(By.linkText("Create New Account")).isDisplayed()) {
	  
		  System.out.println("test case is pasees ..........");
	  }else {
		System.out.println("failed..........");
	}
	  System.out.println("Te stest case is cimpleted ..........");
	  
	  driver.quit();
}
}