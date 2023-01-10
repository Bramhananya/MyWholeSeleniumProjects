package Practice_On_New_Websites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	

	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("https://s1.demo.opensourcecms.com/wordpress/");	
		Thread.sleep(5000);
	
		if(driver.findElement(By.xpath("//p[@id='logo']")).isDisplayed())
		{
			System.out.println("Right link has opened successfully....");
		}else 
		{
			System.out.println("Wrong link has opened......");
		}
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		
		Thread.sleep(2000);
		
	   String all_text = 	driver.findElement(By.xpath("/html/body/p[2]")).getText();
	    System.out.println(all_text);
    	System.out.println("-----------------------------------------------------------------------------------------------------");
    	
	    Thread.sleep(2000);
	   String getting_text =  driver.findElement(By.xpath("/html/body/h2")).getText();
	   System.out.println(getting_text);
	   System.out.println("--------------------------------------------------------------------------------------------------");
	   
	   Thread.sleep(2000);
    	String text_print =    driver.findElement(By.xpath("/html/body/p[3]")).getText();
    	System.out.println(text_print);
    	
    	System.out.println("--------------------------------------------------------------------------------------------------------");
	    Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='weblog_title']")).sendKeys("Working as a software tester");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Ankita Patil");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='admin_email']")).sendKeys("bbramhakar12@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='button wp-hide-pw']")).click();
		
	    Thread.sleep(3000);
	 
	  WebElement checkbox_click =    driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	  System.out.println(checkbox_click.isSelected());
	  checkbox_click.click();  
	  
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@value='Install WordPress']")).click();
	  
	  Thread.sleep(5000);
	  
	  String get_text =  driver.findElement(By.xpath("(//p[@class='wpdberror'])[1]")).getText();
	  System.out.println(get_text);
	  System.out.println("-----------------------------------------------------------------------------------------------");
	  
	    System.out.println("Test case is passed........");
	    System.out.println("-------------------------------------------------------------------------------------------------------------");
		Thread.sleep(3000);
		
		
	   driver.quit();
		
	}
	
}



