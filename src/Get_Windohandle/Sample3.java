package Get_Windohandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://gmail.com/");				
		driver.findElement(By.linkText("Help")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		Object[] windows = allwindows.toArray();
		
		String window1 = windows[0].toString();
		String window2 = windows[1].toString();
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window2);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(window1);
		
		// System.out.println(driver.getTitle());
		
		driver.quit();
	}

}
