package Get_Current_Url;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://snapdeal.com");
		
		String url = driver.getCurrentUrl();
		System.out.println("Urle of the current page is =>  "   + url);
			
		driver.quit();
		
	}

}
