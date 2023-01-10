package Get_Atribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://google.com");
		
		String x = driver.findElement(By.linkText("Gmail")).getAttribute("href");
		System.out.println(x);
		                                            
	  //  driver.quit();
	    
	    
	}

}
