package Asersions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Sample2 {

	WebDriver driver;

	@BeforeTest
	public void SetDriver() throws InterruptedException{

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();


	}

	@Test
	public void verifyTitle() throws InterruptedException

	{

		driver.get("https://Amazon.com");


		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 5000)");

		String ActualTitle = driver.getTitle();

		System.out.println("Title of the page is ==> " + ActualTitle);

		String ExpectedTitle ="Amazon.com. Spend less. Smile more.";

		Assert.assertEquals(ActualTitle, ExpectedTitle);


		//	System.out.println("Assert passed");

		Thread.sleep(3000);

		String all_text =	driver.findElement(By.xpath("//span[@class='icp-container-desktop']")).getText();

		System.out.println(all_text);


		WebElement language = 	driver.findElement(By.xpath("//span[@class='icp-container-desktop']"));

		Actions act = new Actions(driver);

		act.moveToElement(driver.findElement(By.xpath("//span[@class='icp-container-desktop']")));

		act.build().perform();

	}

	@AfterTest
	public void closedriver(){

		driver.close();

	}

}
