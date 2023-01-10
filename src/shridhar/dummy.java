package shridhar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dummy {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement  pwd = driver.findElement(By.name("txtPassword"));
		pwd.sendKeys("Qedge123!@#");
		
		driver.findElement(By.className("button")).click(); 
		
		driver.findElement(By.partialLinkText("Welcome")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		System.out.println("completed");
		driver.close();

		
		
		

	}

}
