package Select_Class;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class samle4 {
	
	WebDriver driver;
	@BeforeMethod
	public void iterateOverOptions() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			 driver = new ChromeDriver();
			 driver.manage().window().maximize();
			 driver.get("https://www.facebook.com/");
			 driver.findElement(By.linkText("Create New Account")).click();
			
			Thread.sleep(2000);
	}
	
	@Test
	public void setup() throws InterruptedException {	
		// Select Day
		WebElement day = driver.findElement(By.id("day"));
		day.click();
		List<WebElement> allDayDropDownOptions = driver.findElements(By.xpath("//select[@id='day']/option"));
		selectOptionInDropDownUsingIteration(allDayDropDownOptions, "3");
 
		Thread.sleep(3000);
		
		//   here we are goung to select the month of the calender....
		
		WebElement month = driver.findElement(By.id("month"));
		month.click();
		List<WebElement> allMonthDropDownOptions = driver.findElements(By.xpath("//select[@id='month']/option"));
		selectOptionInDropDownUsingIteration(allMonthDropDownOptions, "Aug");
 
		Thread.sleep(3000);
		
		// here wew are goung to selct the year if the calender......
		WebElement year = driver.findElement(By.id("year"));
		year.click();
		List<WebElement> allYearDropDownOptions = driver.findElements(By.xpath("//select[@id='year']/option"));
		selectOptionInDropDownUsingIteration(allYearDropDownOptions, "1990");
 
	}
 
	private void selectOptionInDropDownUsingIteration(List<WebElement> dropDownOptions, String optionToBeSelected) {
		
		boolean isFound = false;
		
		for (WebElement option : dropDownOptions) {
			if (option.getText().equals(optionToBeSelected)) {
				option.click();
				isFound = true;
				break;
			}
 
		}
		if (!isFound)
			System.out.println("No matching opion found.");
 
	}
	
	@AfterMethod
	public void seup_close() {
		
		driver.quit();
		System.out.println("Test case is passed........");
	
		System.out.println("All the accounts are successfullyy hacked.......");
	}

}

