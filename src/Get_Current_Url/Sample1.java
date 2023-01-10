package Get_Current_Url;

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
		
		driver.findElement(By.linkText("Gmail")).click();
		String pgurl = driver.getCurrentUrl();
		System.out.println(pgurl);			

		if(pgurl.toLowerCase().contains("gmail"))
		{
			System.out.println("GMail Link working, test pass");
		}else
		{
			System.out.println("GMail Link not working, test fail");
		}
		
		driver.close();
		
	}

}
