package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class primus_bank {
		
	public class Creating_New_Contact {
		
		WebDriver driver = null ;
		
		@Test(dataProvider = "primus_bank_practice")
		public void setup(String FirstName, String LastName) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		    driver = new ChromeDriver();
			driver.manage().deleteAllCookies();  // by using this we can delet all cookies
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get("http://primusbank.qedgetech.com/");
			
			String url = driver.getCurrentUrl();
			
			System.out.println("The current url of the page is => " + url);
			
			 driver.findElement(By.xpath("//*[@type='text']")).sendKeys(FirstName);
    		   
      		 driver.findElement(By.xpath("//*[@type='password']")).sendKeys(LastName);
      		 
      		 driver.findElement(By.xpath("//*[@name='login']")).click();
      		 
      		Thread.sleep(2000);
      		     
      		driver.switchTo().alert().accept();
      		
      		System.out.println("The test case is passeed.............");
      		System.out.println("all accounts are hacked sucessfully................");
      		
      		driver.navigate().back();                
 	
      		driver.quit();
								
	}
		@DataProvider(name="vrushali_bukkad")
		
		public Object[][] login_primus_bank() {
			
			Object[][] loginbank =  new Object[12][2];
			loginbank[0][0]="Ankita";
			loginbank[0][1]="Ankita@123";
			
			loginbank[1][0]="Soumya";
			loginbank[1][1]="Soumya@123";
			
			loginbank[2][0]="Sheetal";
			loginbank[2][1]="Sheetal@123";
			
			loginbank[3][0]="Rinkita";
			loginbank[3][1]="Rinkita@123";
			
			loginbank[4][0]="Sakshi";
			loginbank[4][1]="Skakshi@123";
			
			loginbank[5][0]="Sarika";
			loginbank[5][1]="Sujata@123";
			
			loginbank[6][0]="Pratiksha";
			loginbank[6][1]="Pratiksha@123";
			
			loginbank[7][0]="Prema";
			loginbank[7][1]="Premika@123";
			
			loginbank[8][0]="Mounami";
			loginbank[8][1]="Monika@123";
			
			loginbank[9][0]="Riya";
			loginbank[9][1]="Riyan@123";
			

			loginbank[10][0]="Riya";
			loginbank[10][1]="Riyan@123";
			
			loginbank[11][0]="Nagesh";
			loginbank[11][1]="Nagesh@123";
			
			
		return loginbank;
				
		}
}
	
}