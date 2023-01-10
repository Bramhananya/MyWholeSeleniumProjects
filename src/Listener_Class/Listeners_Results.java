
package Listener_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Class.Listesner_Demo_Practice.class)
public class Listeners_Results {
	
	WebDriver driver;
	
	@BeforeMethod
	public void google_test() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://Google.com");	
        driver.navigate().back();
			
   	}
	
	@Test(priority = 1)
	public void click_about() {
		
		driver.findElement(By.linkText("About")).click();
	}
	
	@Test(priority = 2)
	public void about_click() {
		driver.findElement(By.linkText("Abouit")).click();
	}
	
	@Test(priority = 3)
	public void product() {
		driver.findElement(By.linkText("Products")).click();
	}
	
	@Test(priority = 4)
     public void inter_name() {
    	 driver.findElement(By.name("q")).sendKeys("Ankita Sharma");
    	 driver.findElement(By.name("btnK")).click();
     }
	
	@Test(priority = 7)
	public void shruti() {
		driver.findElement(By.linkText("Ankita Sharma")).click();
		
	}
	
	@Test(priority = 5)
	public void search() {
		driver.findElement(By.name("btnK")).click();
	}
	
	@Test(priority = 8,dependsOnMethods = "shruti")
	public void advertising() {
		driver.findElement(By.linkText("Advertising")).click();
	}
	
	@Test(priority = 9,timeOut = 2000)
	    public void business() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.linkText("Business")).click();
	}	
	
		@Test(priority = 10)
		public void click_methds() {
			driver.findElement(By.xpath("//*[type='text']")).click();
	}
	
		@Test
		public void ashi() {
			
			driver.findElement(By.linkText("khadus ashi")).click();
		}
		
	@AfterMethod			
	public void google_demo_end(){
	
		driver.quit();
		
		
    	}
	}


