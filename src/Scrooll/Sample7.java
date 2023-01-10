package Scrooll;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Sample7 {

  public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://phptravels.com/demo/");
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		WebElement all_values = driver.findElement(By.xpath("//input[@name='first_name']"));
	  
	    js.executeScript("arguments[0].value = 'Riya Patil' ", all_values);
	    
	System.out.println("First name is  is puted successfully......");
	
	Thread.sleep(2000);
	WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
	js.executeScript("arguments[0].value = 'Ankita Deshmukh' ", lastname);
	System.out.println(" Lastname entered successfully.......");
	
	Thread.sleep(2000);
	WebElement business_name = driver.findElement(By.xpath("//input[@name='business_name']"));
	js.executeScript("arguments[0].value = 'Software Tester' ", business_name);
	System.out.println("Business name is entered succesfuly");
	
	Thread.sleep(2000);
	WebElement email = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
	js.executeScript("arguments[0].value = 'bbramhakar12gmail.com' ", email);
	System.out.println("Gmail is entered sucessfully................");
	System.out.println("---------------------------------------------------------------------------------------------");
	
	System.out.println("Test case is passed.....");
	
	Thread.sleep(3000);

   WebElement features = driver.findElement(By.xpath("//div[@class='lvl-0 dropdown']"));
    features.click();
     System.out.println("features  link has clicked successfully...............");

       for(int i=0; i<=0;i++) {

       String featur = 	features.getText();
         System.out.println(featur);

   }
       System.out.println("All the features texts are successfully printed  here.......");
          System.out.println("---------------------------------------------------------------------------");
	
	Thread.sleep(3000);
	
	/*WebElement all_product= driver.findElement(By.xpath("//div[@class='lvl-0 dropdown']"));
	all_product.click();
	WebElement all_product = driver.findElement(By.xpath("//div[@class='lvl-0 dropdown open']"));
	all_product.click();

	
	System.out.println("Features link has clicked successfully.......");
	
	for(int i =0; i<=0; i++) {
		
	   String all_text = all_product.getText();
	   System.out.println(all_text);
	
	}
	
	System.out.println("All the product texts are successfully printed here......");
	System.out.println("---------------------------------------------------------------------");
	/*
			
/*	Thread.sleep(3000);
	
	
	WebElement company = driver.findElement(By.xpath("(//*[@class='currentLanguage'])"));
	company.click();
	
	for(int i =1; i<=10; i++) {
		
		   String comp = company.getText();
		   System.out.println(comp);
		
		}
	   System.out.println("All the company texts are successfully printed here.......");
		System.out.println("---------------------------------------------------------------------");*/

	driver.quit();
   }	
	
  }
