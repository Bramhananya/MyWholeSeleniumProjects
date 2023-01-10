package Orange_HRM_Login_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_Classes.Facebook_Design_Home_Page;

public class Fb_Page_Login {
	
	@Test
	public void login_facebook() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://Facebook.com");
		
		
		Facebook_Design_Home_Page login_information = new Facebook_Design_Home_Page(driver);
		
		login_information.fb_fill_usernme("Ankita Panchal");
		login_information.fb_fill_password("Ankita@123");
		login_information.fb_clicl_login_button();
		
		Thread.sleep(3000);
		
		driver.navigate().back();
		login_information.cliclk_create_button();
		System.out.println("Completed..............");
		
		Thread.sleep(3000);
		 
		driver.quit();
		
	}
	

}
