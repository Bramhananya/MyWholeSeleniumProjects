package dshrikant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rinkita_Sample {
	
	public static void main(String[] args) throws InterruptedException {
		
	    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		WebElement anky =driver.findElement(By.xpath("//input[@id='username']"));
		anky.sendKeys("admin");
		Thread.sleep(2000);
		
		WebElement anky2 =driver.findElement(By.xpath("//input[@name='pwd']"));
		anky2.sendKeys("Pooja@123");
		
		anky.clear();
		
		driver.quit();
		
	}

}
