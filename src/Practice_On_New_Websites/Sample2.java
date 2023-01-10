package Practice_On_New_Websites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	    driver.get("http://book.theautomatedtester.co.uk/");	
	    
	    Thread.sleep(5000);
	    if(driver.findElement(By.linkText("Error: Server Error")).isDisplayed())
	    {
	    	System.out.println("The ;link has successfully opened..........");
	    }else 
	    {
	    	System.out.println("The link has got wrong opened.............");
	    }
	    	
       Thread.sleep(3000);
       String get_text =	 driver.findElement(By.xpath("/html/body/h2[1]")).getText();
       System.out.println(get_text);
		
       Thread.sleep(3000);
       driver.quit();
	}

}
