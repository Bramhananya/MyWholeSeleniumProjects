package Action_Clas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample_flipcard {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();		
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("https://www.flipkart.com/");	
	
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	
	Thread.sleep(5000);
	Actions act = new Actions(driver);
	
	act.moveToElement(driver.findElement(By.linkText("Electronics")));
	
	act.build().perform();
	act.moveToElement(driver.findElement(By.linkText("Gaming"))).click();
	act.contextClick();
	act.build().perform();
	Thread.sleep(3000);
	driver.navigate().back();

   	Thread.sleep(3000);
	driver.quit();
	
	}
}
