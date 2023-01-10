package Vrushali_Flipcard;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcard {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		// Here we need to remove the mousecut property

		Actions act = new Actions(driver);
		act.moveToElement(	driver.findElement(By.xpath("//div[contains(text(),'Fashion')]")));
		act.build().perform();

		Thread.sleep(5000);

		List<WebElement> all_mouise_element =   driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']"));

		for(WebElement vrushali_elemnts : all_mouise_element) {

			String vrushu = vrushali_elemnts.getText();
			System.out.println(vrushu);

			if(vrushu.contains("Men's Top Wear")) {

				vrushali_elemnts.click();
			}
		}

		Thread.sleep(2000);

		driver.navigate().back();
		WebElement vrushali_ggg = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));

		act.moveToElement(vrushali_ggg);
		act.build().perform();
		
		Thread.sleep(2000);

		WebElement vrushi =	driver.findElement(By.xpath("(//a[@class='_6WOcW9'])[1]"));

		act.moveToElement(vrushi).contextClick().build().perform();

	}
}

