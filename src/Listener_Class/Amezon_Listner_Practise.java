package Listener_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener_Class.Amezon_Listner.class)
public class Amezon_Listner_Practise {

	WebDriver driver;
		
	@BeforeMethod
	public void Amezon_Practise_SetUp() throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		System.out.println("the link is working");
		driver.findElement(By.linkText("See All")).click();	
		
	}
	
	@Test(priority = 1)
	 public void click_All() {
		 
		 driver.findElement(By.linkText("All")).click();
	 }
	@Test(priority = 2)
	public void Click_See_All() {
		
		driver.findElement(By.linkText("See All")).click();
	}
	@Test(priority = 3)
	public void Find_Books() {
		
		driver.findElement(By.linkText("Books")).click();
	}
	@Test(priority = 4,dependsOnMethods = "click_All")
	public void find_fireTV() {
		
		driver.findElement(By.linkText("Fire TV")).click();
	}
	@Test(priority = 5,dependsOnMethods = "Click_See_All")
	public void Shruti_Love() {
		
		driver.findElement(By.linkText("Shruti Loves mi...")).click();		
	}
	@Test(priority = 6)
	public void Pay_amazon() {
		
		driver.findElement(By.linkText("Amazon Pay")).click();
	}
	@Test(priority = 7)
	public void fations() {
		
		driver.findElement(By.linkText("Men's Fashion")).click();
		driver.findElement(By.linkText("Jeans")).click();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0, 1000)" );
	
	}
	@Test(priority = 8,timeOut = 10000)
	  public void Failing_case() throws InterruptedException {
		  Thread.sleep(5000);
		  driver.findElement(By.linkText("Electronics")).click();
	  }	
	
	@AfterMethod
	public void Amezon_Closed_Up() {
		
		driver.quit();
	}
		
}
