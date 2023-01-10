package Parameters_practise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Creating_New_Contact {
	
	
	WebDriver driver;
	
	@Test
	@Parameters({"url","FirstName","LastName","MobNo","Password","Gender"})
	public void setup(String url, String FirstName, String LastName,  String MobNo,  String Password, String Gender) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);		
	    driver.get(url);		
	    
	    
	    
		driver.findElement(By.linkText("Create New Account")).click();
		
		   driver.findElement(By.name("firstname")).clear();
		   driver.findElement(By.name("firstname")).sendKeys(FirstName);
		 
		   driver.findElement(By.name("lastname")).clear();
		   driver.findElement(By.name("lastname")).sendKeys(LastName);
		 
		   driver.findElement(By.name("reg_email__")).clear();
		   driver.findElement(By.name("reg_email__")).sendKeys(MobNo);
		 
		   driver.findElement(By.name("reg_passwd__")).clear();
		   driver.findElement(By.name("reg_passwd__")).sendKeys(Password);
		   
	
		   driver.findElement(By.name("sex")).clear();
		    boolean b =  driver.findElement(By.name("sex")).isSelected();
	    	System.out.println(Gender);
	    	
	    	
	    	driver.quit();
		
	}
	 

	}
	 
	
		   
		
	   
		
	
    

