package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6 {
       
	   public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver = new ChromeDriver();		
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();	
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.get("http://flights.qedgetech.com/");	
			
			driver.findElement(By.name("email")).sendKeys("sureshbabu.qedge@gmail.com");
			driver.findElement(By.name("password")).sendKeys("demo");
			driver.findElement(By.xpath("//*[@type='submit']")).click();
			
			String doj = "24/August/2025";
			String[] temp = doj.split("/");
			String dt = temp[0];
			String month = temp[1];
			String year = temp[2];
			
			driver.findElement(By.id("search-date")).click();
			
			String calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			
			while(!calyear.equals(year))
			{
				driver.findElement(By.linkText("Next")).click();
				calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			}
			
			String calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			while(!calmonth.equalsIgnoreCase(month))
			{
				driver.findElement(By.linkText("Next")).click();
				calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			}
			
			WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
			List<WebElement> rows = cal.findElements(By.tagName("tr"));
			for(int i=1;i<rows.size();i++)
			{
				List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
				for(int j=0;j<cols.size();j++)
				{
					String caldt = cols.get(j).getText();
					if(caldt.equals(dt))
					{
						cols.get(j).click();
						break;
					}
				}
        	}	   	 
		System.out.println("All dates are successfully kept here......");
		 
		 Thread.sleep(3000);
		 driver.quit();
	}
	   
}
