package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_provider_Sample {
	
	
WebDriver driver;
	
	@Test(dataProvider = "Login_Orange_Hrm")
	public void setup(String username, String password) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://OrangeHRM.com");
       
		
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.id("btnLogin")).click();
		
		//Assert.assertTrue(driver.findElement(By.linkText("Welcome")).isDisplayed());
		
	   // Thread.sleep(2000);
		
		  System.out.println("Orange HRM login successfully...........");
			
	    driver.navigate().back();
	//    System.out.println("Orange HRM login successfully...........");
	
	    driver.quit();
	
	}	
	
	   @DataProvider(name="Login_Orange_Hrm")
	   
		public Object[][] login_hrm() {
			
			Object[][] loginhrm =  new Object[11][2];
			loginhrm[0][0]="Ankita";
			loginhrm[0][1]="Ankita@123";
			
			loginhrm[1][0]="Soumys";
			loginhrm[1][1]="Soumya@123";
			
			loginhrm[2][0]="Sheetal";
			loginhrm[2][1]="Sheetal@123";
			
			loginhrm[3][0]="Rinkita";
			loginhrm[3][1]="Rinkita@123";
			
	    	loginhrm[4][0]="Sakshi";
			loginhrm[4][1]="Skakshi@123";
			
			loginhrm[5][0]="Sarika";
			loginhrm[5][1]="Sujata@123";
			
			loginhrm[6][0]="Pratiksha";
			loginhrm[6][1]="Pratiksha@123";
			
			loginhrm[7][0]="Prema";
			loginhrm[7][1]="Premika@123";
			
			loginhrm[8][0]="Mounami";
			loginhrm[8][1]="Monika@123";
			
			loginhrm[9][0]="Riya";
			loginhrm[9][1]="Riyan@123";
			

			loginhrm[10][0]="Nagesh";
			loginhrm[10][1]="Naghesh@123";
			
			
			return loginhrm;
			
				
		    }
		}	
	
