package Parameters_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Filling_prameters {
	
	WebDriver driver;
	
	@Test
	@Parameters({"FacebookUrl","Useridvalue","PasswordName"})
     public void yahoo_login(String FacebookUrl, String Useridvalue, String PasswordName) { 
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(FacebookUrl);
		
		driver.findElement(By.id("email")).sendKeys(Useridvalue);
		driver.findElement(By.id("pass")).sendKeys(PasswordName);
		
		driver.findElement(By.linkText("Create New Account")).click();
		
		driver.quit();
		
}

}
