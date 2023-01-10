package Asersions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample3 {

	public static void main(String[] args) throws InterruptedException   {


		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://Amazon.com");


		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 5000)");

		Thread.sleep(5000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='icp-touch-link-language']")));
		
		
		act.click();
		act.build().perform();

        WebElement select = driver.findElement(By.xpath("(//div[@class='a-row a-spacing-mini'])[3]"));
        select.isSelected();
        select.click();
		
        Thread.sleep(3000);
        
		driver.findElement(By.xpath("(//span[@class='a-button-inner'])[3]")).click();
		
		if(driver.findElement(By.xpath("//div[@class='nav-line-1-container']")).isDisplayed()) {
			
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}

		Thread.sleep(3000);

		driver.quit();



	}

}
