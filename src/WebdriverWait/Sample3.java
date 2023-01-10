package WebdriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sample3 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	
		//Thread.sleep(3000);// to reduce the speed of selenium
		
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("Ankushmumar");
		
		System.out.println("Name places successfully.............");
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		
	/*	
		WebDriverWait wait2 = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.alertIsPresent());   */
		
		Thread.sleep(2000);
		driver.quit();
		
		                                  		
	}

}
