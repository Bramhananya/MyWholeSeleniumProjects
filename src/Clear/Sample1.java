package Clear;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://facebook.com/");

		WebElement uid = driver.findElement(By.name("email"));
		
		uid.sendKeys("QEdge");
		Thread.sleep(3000);
		
		uid.clear();
		
		String URL = driver.getCurrentUrl();
		System.out.println("The url is => " + URL);
		driver.quit();
		System.out.println("The test case is passed..........");
		
		driver.quit();
		
	}

}
       // clear() : It removes data present in the specified element
