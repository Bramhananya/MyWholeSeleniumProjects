package Action_Clas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Snapdeal_practice {
		
	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("Webdriver.chrome.driver", "chromedriver.exe");
		   WebDriver  driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get("https://www.snapdeal.com/");
			driver.manage().window().maximize();
			System.out.println("the case is completed.........");
			
		    Thread.sleep(3000);
			
			/*driver.findElement(By.linkText("Gift Cards")).click();
			
	    	driver.navigate().back();
		     driver.findElement(By.linkText("Help Center")).click();
		     driver.navigate().back();
		     driver.findElement(By.linkText("Sell On Snapdeal")).click();
		     driver.navigate().back();
		     
		     driver.findElement(By.linkText("Download App")).click();
		     driver.navigate().back();
		     System.out.println("the work is completed...........");*/
		     
		     int i = 5;
		     
		     do {   driver.findElement(By.className("next-i")).click();
				// System.out.println(web);
				   i++;
			} while (i <=5);
		     	     
		   //  driver.quit();
		     	     
	}	
}
