package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Asertions_Use {
	
WebDriver driver;
	
	@BeforeMethod
	public void set_up_google() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		 driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://google.com");
		Thread.sleep(3000);
	}	
      
	@Test
	public void googleTitleTest() {
		
		String titlegoogle = driver.getTitle();
		System.out.println(titlegoogle);
		
		Assert.assertEquals(titlegoogle, "Google","Title is correct....");
		
	}
	@Test
	public void click_about() {
	boolean b =	driver.findElement(By.linkText("About")).isDisplayed();
	
		Assert.assertTrue(b);		
	}
		
	@AfterMethod
     public void testclose() {
		driver.quit();
		
	}
}
