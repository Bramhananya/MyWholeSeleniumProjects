package bhim;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.source.tree.ForLoopTree;

public class Konetu {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://facebook.com");
				
		driver.findElement(By.id("email")).sendKeys("Koneru dummalwad");
		driver.findElement(By.id("pass")).sendKeys("7448081280");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(3000);
		
		WebElement web =driver.findElement(By.name("birthday_day"));
		Select s = new Select(web);
		
		List<WebElement> alltext = s.getOptions();
		System.out.println(alltext.size());
		System.out.println("----------------------------------------------------------------------------");
		
		for(int i=1;i<=alltext.size();i++) {
			
			System.out.println("All date of birth :"+ i);
		}
		
		System.out.println("--------------------------------------------------------------------------");
		
		WebElement allmonts = driver.findElement(By.name("birthday_month"));
		Select mon = new Select(allmonts);
				
		List<WebElement> allmonths = mon.getOptions();
		System.out.println(allmonths.size());
		System.out.println("------------------------------------------------------------------------------------");		
		
		for(int b = 1; b<=allmonths.size();b++) {
			System.out.println("date of months :" + b);
		}
		
		System.out.println("----------------------------------------------------------------------------------");
		
	  WebElement allyear = driver.findElement(By.name("birthday_year"));
	  Select year = new Select(allyear);
	  
		List<WebElement> allyears = year.getOptions();
		System.out.println(allyears.size());
		System.out.println("----------------------------------------------------------------------------------------");
		
		for(int c =1; c<=allyears.size();c++) {
			
			System.out.println("date of year :" + c);
		}
			System.out.println("-------------------------------------------------------------------------------------");
		driver.quit();
		
		
		
	}

}
