package Get_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://orangehrm.qedgetech.com");
		driver.findElement(By.id("txtUsername")).sendKeys("abc");
		driver.findElement(By.id("txtPassword")).sendKeys("xyz");
		driver.findElement(By.id("btnLogin")).click();
		
		String errmsg = driver.findElement(By.id("spanMessage")).getText();
		System.out.println(errmsg); 
		
		if(errmsg.toLowerCase().contains("invalid"))
		{
			System.out.println("Test Pass");
		}else
		{
			System.out.println("Test Fail");
		}
		driver.close();
		
	}

}
