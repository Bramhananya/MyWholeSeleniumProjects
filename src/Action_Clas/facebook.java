package Action_Clas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	
		try {
			driver.findElement(By.linkText("bout")).click();
			System.out.println("The link is successfully clicked...........");
			
		} catch (Exception e) {
			System.out.println("Elements are not found as per the requirment");
			System.out.println("Completed");
		}
		
		driver.findElement(By.linkText("About")).click();
		driver.quit();
		
	}

}
