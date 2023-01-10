package bhim;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample4 {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http:\\facebook.com");
		
		
		driver.findElement(By.id("email")).sendKeys("Koneru dummalwad");
		driver.findElement(By.id("pass")).sendKeys("7448081280");
		
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		
	   String date =  driver.findElement(By.xpath("//*[@name='birthday_day']")).getText();
	   System.out.println("date of birth :" + date);
	   

	   String months =  driver.findElement(By.xpath("//*[@name='birthday_month']")).getText();
	   System.out.println("date of birth :" + months);
	   

	   String years =  driver.findElement(By.xpath("//*[@name='birthday_year']")).getText();
	   System.out.println("date of birth :" + years);
	                   
	                       /* providing the value  select class */
	                   
	  Select April = new Select(driver.findElement(By.name("birthday_day")));
	   April.selectByIndex(9);
	   
	                       /* providing the value without select class */
	   
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//*[@id='day']")).sendKeys("10");
	  	
	  	
	  	
		driver.quit();
		
	}

}
