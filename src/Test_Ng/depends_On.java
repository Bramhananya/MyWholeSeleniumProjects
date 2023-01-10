package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class depends_On {
	
	WebDriver driver;

	@BeforeMethod
  public void setup_facebook() throws InterruptedException {
    	  
    	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    	  driver = new ChromeDriver();
    	  driver.manage().deleteAllCookies();
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  driver.get("http://Facebook.com");
    	 
    	  Thread.sleep(3000);
    	
    	  
	  } 	  
	
        @Test(timeOut = 5)
        public void login_facebook() {
        	driver.findElement(By.linkText("Games")).click();
        	System.out.println("login test successfully done.......");
        	//int i = 9/0;
        	
        	
        }
        
    /*    @Test(dependsOnMethods = "login_facebook")
        public void logout_facebook() {  
        	driver.findElement(By.linkText("Games")).click();
      //  	System.out.println("Logout Facebook test successfully.......");
        	System.out.println("test cace is failed....");
        }
        */
        @AfterMethod
        public void set_up_close() {
        	driver.quit();
        	
        }

}
