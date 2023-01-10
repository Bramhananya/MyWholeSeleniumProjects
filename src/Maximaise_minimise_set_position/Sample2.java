package Maximaise_minimise_set_position;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample2 {
	public static void main(String[] args) {
		
		 
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.manage().window().fullscreen();
		  driver.get("http://amazon.com");
		  
         
		  driver.findElement(By.linkText("All")).click();
		  
			Actions practice = new Actions(driver);
			practice.moveToElement(driver.findElement(By.linkText("Electronics"))).click();
			practice.contextClick();
			practice.build().perform();
		    driver.findElement(By.linkText("Headphones")).click();
		    
		    driver.get("http://facebook.com");
		    driver.findElement(By.linkText("Create New Account")).click();
			
			Select date = new Select(driver.findElement(By.id("day")));
			date.selectByVisibleText("20");
			Select month = new Select(driver.findElement(By.id("month")));
			month.selectByValue("8");
			Select year = new Select(driver.findElement(By.id("year")));
			year.selectByValue("1997");
			
			
			driver.get("http://snapdeal.com");
			driver.get("http://gmail.com");
			
			System.out.println("test case is passed");
		
		
		
	}

}
