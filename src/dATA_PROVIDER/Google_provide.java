package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Google_provide {
	
WebDriver driver;

@Test(dataProvider = "Bramhananya@143")
  public void setUp_instagram(String userid, String Password) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com/");    
		
		String url = driver.getCurrentUrl();
		System.out.println("The url of the current page is => " + url);
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(userid);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(Password);
			
		Thread.sleep(5000);
	   driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]/button/div")).click();
		
	   System.out.println("All acconts are hacked successfully..........");
		driver.navigate().back();
		
		driver.quit();
				
}
        @DataProvider(name="Bramhananya@143")
		public Object[][] validate_instagram() {
			
			Object[][] validate_instagram = new Object[12][2];			
			
			validate_instagram[0][0]="Bramha@123";			
			validate_instagram[0][1]="Ananya143";
			
			validate_instagram[1][0]="Shital@123";			
			validate_instagram[1][1]="Ananya143";
			
			validate_instagram[2][0]="Soumya@123";			
			validate_instagram[2][1]="Ananya143";
			
			validate_instagram[3][0]="Rani@123";			
			validate_instagram[3][1]="Ananya143";
			
			validate_instagram[4][0]="Katrina@123";			
			validate_instagram[4][1]="Ananya143";
			
			validate_instagram[5][0]="kajol@123";			
			validate_instagram[5][1]="Ananya143";
		
			validate_instagram[6][0]="Aishwariya@123";			
			validate_instagram[6][1]="Ananya143";

			validate_instagram[7][0]="Anushka@123";			
			validate_instagram[7][1]="Ananya143";
			
			validate_instagram[8][0]="Alia@123";			
			validate_instagram[8][1]="Ananya143";
		
			validate_instagram[9][0]="Ankita@123";			
			validate_instagram[9][1]="Ananya143";

			validate_instagram[10][0]="Maheshwari@123";			
			validate_instagram[10][1]="Ananya143";
		
			validate_instagram[11][0]="Shrikant@123";			
			validate_instagram[11][1]="Ananya143";
			
		//  System.out.println(" Test case is complete..................");
		return validate_instagram;
		
		
		
	}

}
