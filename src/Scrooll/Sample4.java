package Scrooll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://Snapdeal.com");
		
		Thread.sleep(3000);
		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,700)");
		System.out.println("The test case is completed...........");
		
		driver.get("http://yehoo.com");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("username")).sendKeys("bbramhakar12@gmail.com");
	
		Thread.sleep(2000);
		JavascriptExecutor java1 = (JavascriptExecutor)driver;
    	WebElement checkbox = 	driver.findElement(By.xpath("//*[contains(text(),'Stay signed')]"));
		java1.executeScript("arguments[0].click()",checkbox );
		
		driver.get("http://facebook.com");
		
        driver.findElement(By.xpath("//*[contains(text(),'Create New')]")).click();
    
        Thread.sleep(3000);
		JavascriptExecutor jsd = (JavascriptExecutor)driver;
	    WebElement button =  driver.findElement(By.xpath("//input[@value='1']"));
		jsd.executeScript("arguments[0].click()", button);
		
		JavascriptExecutor jsd2 = (JavascriptExecutor)driver;
		WebElement click = driver.findElement(By.linkText("Sign Up"));
		jsd2.executeScript("arguments[0].click",click);
		
		Thread.sleep(3000);
	driver.quit();
	}

}
