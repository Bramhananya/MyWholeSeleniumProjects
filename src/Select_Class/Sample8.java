package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample8 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.name("search_query")).sendKeys("Shooes");
		driver.findElement(By.name("submit_search")).click();
		
		Thread.sleep(5000);
		driver.navigate().back();
		
	/*	driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click();
		System.out.println("button cart is clicked......");*/
		
	//	Thread.sleep(3000);
		//driver.quit();
		
	}

}
