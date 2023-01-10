package Get_Atribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		String x =  driver.findElement(By.xpath("//img[@src='https://static.xx.fbcdn.net/rsrc.php/y8/r/dF5SId3UHWd.svg']")).getAttribute("alt");
		System.out.println(x);
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
