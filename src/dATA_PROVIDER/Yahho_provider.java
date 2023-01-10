package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Yahho_provider {
	
	WebDriver driver;
	
	@Test(dataProvider = "Yahoo_test")
	public void primary_yahoo_setup(String userid) throws InterruptedException {
			
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		
		if(driver.findElement(By.xpath("//img[@class ='logo yahoo-en-US']")).isDisplayed()) {
			
			System.out.println("yhoo account opend successfully.........");
		}else {
			System.out.println("Test case is failed.......");
		}
		
	    String  title = driver.getTitle();
	    System.out.println("The title of the page is => " + title );
	    
	    
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(userid);
		
		System.out.println("Test case is complte.....");
		 
		System.out.println("All accounts are hacked successfully.......");
		driver.navigate().back();
		driver.navigate().forward();
		
		driver.quit();
	
	}

	@DataProvider(name="Yahoo_test")
	public Object[]  yahoo_put_value() {
		
		Object[] put_value = new Object[24];
		
		put_value[0]="Bramha@123";			
		put_value[1]="Ananya143";
		
		put_value[2]="Shital@123";			
		put_value[3]="Megha@123";
		
		put_value[4]="Soumya@123";			
		put_value[5]="Merra@123";
		
		put_value[6]="Rani@123";			
		put_value[7]="Radhik@123";
		
		put_value[8]="Katrina@123";			
		put_value[9]="Puja@123";
		
		put_value[10]="kajol@123";			
		put_value[11]="Sandhya@123";
	
		put_value[12]="Aishwariya@123";			
		put_value[13]="Aradhya@123";

		put_value[14]="Anushka@123";			
		put_value[15]="Samiksha@123";
		
		put_value[16]="Alia@123";			
		put_value[17]="Kalpana@123";
	
		put_value[18]="Ankita@123";			
		put_value[19]="Priya@123";

		put_value[20]="Maheshwari@123";			
		put_value[21]="Priyanka@123";
	
		put_value[22]="Shrikant@123";			
		put_value[23]="Mounami@123";
			
		return put_value;	
	
	}	
	
}
