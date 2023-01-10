package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chandrakant {
	
public static void main(String[] args) {
		

		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
			driver.get("http://facebook.com");
			
	  driver.findElement(By.id("email")).sendKeys("7448081280");
	  driver.findElement(By.name("pass")).sendKeys("Ankita@123");
	  
	  driver.findElement(By.name("login")).click();
	  
	  System.out.println("the case is incompleted");
	  

}
}