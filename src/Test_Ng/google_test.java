package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class google_test {
	
	WebDriver driver;
	
	@BeforeSuite
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
		public void fill_char() {
			
			driver.findElement(By.xpath("//*[@class='gLFyf gsfi']")).sendKeys("Ankita@123");
			System.out.println("char is filled");
			System.out.println("test case is pass");
			
		}
		
	@Test
	    public void img_test() {
		driver.findElement(By.linkText("Images"));
		System.out.println("link is working");
		System.out.println("test case is passed");
		
	}
	
	@Test
	public void img_testing() {
		driver.findElement(By.name("q")).sendKeys("Sonu nigam images with singing");
		System.out.println("link is working");
		System.out.println("test case is passed");
	}
	
	
	@AfterSuite
	public void set_uo_closed() {
		driver.quit();
	}
	
}	
	
	
	
	
	
	
	
	
	

