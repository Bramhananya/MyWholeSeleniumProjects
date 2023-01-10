package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class My_date_Of_Birth {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.edge.driver", "msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	    driver.get("http://facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();
		
		
		System.out.println("The link has been successfully clicked.......");
		
		Thread.sleep(3000);
		
		if(driver.findElement(By.linkText("Sign Up")).isDisplayed()) {
			
			System.out.println("the test case us passed.........");
		}else {
			
			System.out.println("The test is failed..........");
		}
		
		driver.findElement(By.name("firstname")).sendKeys("chandrakant");
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("20");
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("8");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		
	/* WebElement web = driver.findElement(By.name("sex"));
		System.out.println(web.isSelected());
		web.click();  */
		
		WebElement element = driver.findElement(By.xpath("//input[@value='2']"));
		System.out.println(element.isSelected());
		element.click();
		
		System.out.println("The test case is completed...........");
		
		System.out.println("All information is successfulyy filled  heare");
		
		Thread.sleep(2000);
				
		driver.quit();
	}

}
