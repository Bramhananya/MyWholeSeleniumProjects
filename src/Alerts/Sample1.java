package Alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
       public static void main(String[] args) throws InterruptedException {
		
    	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   		WebDriver driver = new ChromeDriver();		
   		driver.manage().deleteAllCookies();
   		driver.manage().window().maximize();	
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		
   		driver.get("http://primusbank.qedgetech.com");			
   		
   		driver.findElement(By.id("txtuId")).sendKeys("abc");
   		driver.findElement(By.id("txtPword")).sendKeys("xyz");
   		driver.findElement(By.name("login")).click();
   		
   		String alertmsg =  driver.switchTo().alert().getText();
   		System.out.println(alertmsg);
   		
   		Thread.sleep(2000);
   		
   		driver.switchTo().alert().accept();
    	   
	 }
}
