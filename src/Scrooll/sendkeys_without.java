package Scrooll;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendkeys_without {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://Snapdeal.com");
		
		String current_url = driver.getCurrentUrl();
		System.out.println(current_url);
		
		if(driver.findElement(By.xpath("//span[@class='accountUserName col-xs-12 reset-padding']")).isDisplayed()) {
			
			System.out.println(" The test case is right ......... aplication opened successfully......");
		}else {
			System.out.println(" The test case is faied ... not opening the applicaion.........");
		}
		
		JavascriptExecutor java = (JavascriptExecutor)driver;
		
    	WebElement valueput = driver .findElement(By.id("inputValEnter"));
		java.executeScript("arguments[0].value='bbramhakar12@gmai.com' ", valueput);
    	
    	System.out.println("The test case is completed..........");
  
    	Thread.sleep(3000);
    	
    	driver.quit();
    			
       }
}
