package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Facebook_Test {
	
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
	  
	  @Test(priority = 1)
	  public void set_up() {
		 driver.findElement(By.xpath("//*[@type='text']")).sendKeys("7448081280");
		 System.out.println("user id inserted successfully");
		 System.out.println("test case pass");		
      }
		 

       @Test(priority = 2)
      public void pass_fill() {
	 driver.findElement(By.id("pass")).sendKeys("Ankita@123"); 
	  System.out.println("password filled successfully");
	  System.out.println("test case pass");
  }
      
       @Test(priority = 3)
      public void clicl_forrgptten() {
       driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
    	System.out.println("messege displayed");
 	   System.out.println("test case pass");
      }   
       
     @Test(priority = 4)
      public void click() {
	  driver.findElement(By.linkText("Create New Account"));
	 System.out.println("button cliked successfully");
	 System.out.println("test case pass");
	  
    }

   
    @Test(priority = 5)
    public void about_click() {
    	driver.findElement(By.linkText("About")).click();
    	System.out.println("test case pass");
    }

    @AfterMethod
     public void set_up_close() {
     	driver.quit();  
	
      }
    		
  } 		
    		
    	
    		  
    		  
    	  
    	  
    	  
    	  
    	  
      
	
	
	
	


