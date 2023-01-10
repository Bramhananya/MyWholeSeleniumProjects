package Dyanamic_Xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amezon_Sample {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://amezon.com");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//div[starts-with(@id,'desktop-grid-1')])[1]")).click();

		Thread.sleep(3000);


		driver.quit();
	}

}
