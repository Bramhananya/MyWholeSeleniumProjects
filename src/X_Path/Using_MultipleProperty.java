package X_Path;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_MultipleProperty {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.get("http://facebook.com");		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='sex' and @value='2']")).click();
		
	}

}
