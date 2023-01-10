package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gmail_Initial {
	
	WebDriver driver;

        @BeforeMethod
       public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");    
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http:\\Google.com");		
	}
	
	     @Test(priority = 1,invocationCount = 2)
        public void test() {
        driver.findElement(By.linkText("About")).click();
        String	title = driver.getTitle();
        System.out.println(title);
        }
	    
	     @Test(priority = 2,invocationCount = 2)
	     public void Gettesxt() {
	     driver.findElement(By.linkText("Business")).click();
	     System.out.println("link is working");
	     }
	     
	     @Test(priority = 3,invocationCount = 2)
	     public void Advertisde() {
	     driver.findElement(By.linkText("Advertising")).click();
	     System.out.println("link is working");
	     }
	     
	     @Test(priority = 4,invocationCount = 2)
	     public void testhow() {
	     driver.findElement(By.linkText("How Search Work")).click(); 
	     System.out.println("link is working");
	     }
	     
	     
	 @AfterMethod
	 public void setupclose() {
	driver.quit();
	 }
	
}

