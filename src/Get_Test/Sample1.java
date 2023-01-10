package Get_Test;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*	driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		
		String x = driver.findElement(By.partialLinkText("works")).getText();
		System.out.println(x);
		driver.findElement(By.linkText("About")).click();
		Thread.sleep(3000);
		String text = driver.findElement(By.className("gradient-overlay")).getText();
		System.out.println(text);
	
		driver.quit();  */
		
		driver.get("https://www.google.com/");

		TakesScreenshot src=(TakesScreenshot)driver;
	File srd = 	src.getScreenshotAs(OutputType. FILE);
		
		
	}

}
