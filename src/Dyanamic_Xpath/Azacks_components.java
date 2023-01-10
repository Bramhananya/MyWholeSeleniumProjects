package Dyanamic_Xpath;

import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Azacks_components {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://Google.com");
		//enter techlistic tutorials in search box
		driver.findElement(By.name("q")).sendKeys("selenium tutorial techlistic");

		//wait for suggestions
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("sbtc")));

		WebElement list=driver.findElement(By.className("sbtc"));

		java.util.List<WebElement> rows = list.findElements(By.tagName("li"));

		for(WebElement elem:rows) {
			System.out.println(elem.getText());

		}
	}

}

