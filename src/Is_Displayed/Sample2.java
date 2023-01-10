package Is_Displayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://primusbank.qedgetech.com");
		
		if(driver.findElement(By.name("login")).isDisplayed())
		{
			System.out.println("test pass");
		}else
		{
			System.out.println("test fail");
		}	
		
		driver.switchTo().alert().accept();		
		
		driver.quit();
	}		

}
