package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.findElement(By.xpath("	//input[@title='Search']	")).sendKeys("Tarak Mehata");
		
	   WebElement tmkuc_episodes =driver.findElement(By.xpath("(//ul[@role='listbox'])[1]"));

	   List<WebElement> all_serches =  tmkuc_episodes.findElements(By.tagName("li"));
	   System.out.println(all_serches.size());
	   
	   System.out.println("-------------------------------------------------------------------------------------");
	
	     for( WebElement sagale_webelement : all_serches) {
	    	 
	    	String all_element = sagale_webelement.getText();
	    	System.out.println("Episodes are => " + all_element);
	    	
	     }
	     
	     Thread.sleep(2000);
	     
	     for(int i =0; i<=all_serches.size(); i++) {
	    	  
	    	  if(all_serches.get(i).getText().toLowerCase().contains("mx player")) {
	    		  
	    		  all_serches.get(i).click();
	    		  break;
	    	  }
	     }
	     
	     System.out.println("-------------------------------------------------------------------------------------");
	     System.out.println("Task is completed...............");
	
	Thread.sleep(5000);
	driver.quit();
	}
}
