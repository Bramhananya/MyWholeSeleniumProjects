package Get_Windohandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
       public static void main(String[] args) {
		
    	   System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
   		WebDriver driver = new ChromeDriver();		
   		driver.manage().deleteAllCookies();
   		driver.manage().window().maximize();	
   		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		
   		driver.get("https://gmail.com/");		
   		
   		driver.findElement(By.linkText("Help")).click();
   		
     	Set<String> allwindows = driver.getWindowHandles();
   		Object[] windows = allwindows.toArray();
   				
   		driver.switchTo().window(windows[1].toString());
   		
   		driver.findElement(By.linkText("Community")).click();
   		
   		System.out.println("The test case is passed ...........");
   		
   		driver.quit();
   		
   		
	}
}
