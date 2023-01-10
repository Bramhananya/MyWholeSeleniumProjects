package Action_Clas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample4 {
	
	public static void main(String[] args) throws InterruptedException {
			
	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://amazon.com");
	
	driver.findElement(By.linkText("All")).click();
	
	Actions practice = new Actions(driver);
	practice.moveToElement(driver.findElement(By.linkText("Electronics"))).click();
	practice.contextClick();
	practice.build().perform();
    driver.findElement(By.linkText("Headphones")).click();
    Thread.sleep(3000);
    
    JavascriptExecutor java = (JavascriptExecutor)driver;
    java.executeScript("window.scrollBy(0, 5000)");
    
    Thread.sleep(3000);
   driver.findElement(By.xpath("//*[@class='s-pagination-item s-pagination-next s-pagination-button s-pagination-separator']")).click();
	
   Actions practice2 = new Actions(driver);
   practice2.moveToElement(driver.findElement(By.id("nav-link-accountList")));
	//practice.contextClick();
	practice.perform();
	
	System.out.println("the task isa completed");
	
    driver.quit();
   
	}
}