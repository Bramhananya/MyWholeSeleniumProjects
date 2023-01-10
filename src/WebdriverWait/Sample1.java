package WebdriverWait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

    /* The procees of matching the speed of the execution of the selenium snd the speed of the application is calles as the sencrcnization .
     * Here we are goinfg to use the explicitly wait  or webdriverwait  depending uopn the condition that we have .
     * To implement the webdriver wait we need to create the object.
     * This wait will work for the all of the condition.
     * Webdriver wait is nothing but the Timeout Exeption. 
     */
public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.name("txtuId")).sendKeys("abc");
		driver.findElement(By.name("txtPword")).sendKeys("xyz");
		driver.findElement(By.name("login")).click();
			
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent()); 
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		System.out.println(" Test case is passed......." );
		
		driver.quit();
	}
          /*  Implecitly wait is nothing but the global type of the wait that we can declre only at once.
           *  There is no need of creating the object to implement the implecitly wait condition.
           *  This wait will works onlt foe the findelement and findelements methods.
           *  No such element exception is the ex., of this wait condition.
           */
}