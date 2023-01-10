package Orange_HRM_Login_Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Pom_Classes.Normal_HRM;

public class Performe_HRM_Test {
	
	
	WebDriver driver = null; 
	
	@Test
	public void perform_test() throws InterruptedException {
		
	//	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	     driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com");
		
		Thread.sleep(3000);
		
		Normal_HRM shrikant =  PageFactory.initElements(driver, Normal_HRM.class);
		shrikant.loginapp("Admin", "Qedge123!@#");
				
	}

}
