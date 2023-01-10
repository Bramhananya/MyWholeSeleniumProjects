package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample7 {
	
	public static  void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://phptravels.com/demo/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0, 400)");
				
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Ankita");
		
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Patil");
		
		driver.findElement(By.xpath("//input[@name='business_name']")).sendKeys("Software Tester");
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("Bbramhakar12@gmail.com");
		Thread.sleep(5000);
		
	/*   WebElement checkbox = driver.findElement(By.xpath("(//div[@role='presentation'])[1]"));
	   System.out.println(checkbox.isSelected());
		checkbox.click();   */
		
	//	driver.findElement(By.xpath("lc-1va8xpi e1dmt1bi0")).click();
		
		driver.findElement(By.xpath("//*[@class='wow flash']")).click();
	   
	   System.out.println(" The test case is passed successfully.......");
	   	
		Thread.sleep(3000);
		driver.quit();
			
	}

}
