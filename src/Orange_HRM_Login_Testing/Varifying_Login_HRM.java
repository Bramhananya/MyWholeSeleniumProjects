package Orange_HRM_Login_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pom_Classes.Login_Orangre_HRM;

public class Varifying_Login_HRM {
	
	
	@Test
	public void varify_Login_HRM() throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		
		Login_Orangre_HRM login = new Login_Orangre_HRM(driver);
		login.typeusername("Admin");
		login.typepassword("Qedge123!@#");
		login.clickloginbutton();
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
