package Dyanamic_Xpath;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Filling_form {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();

		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");


		driver.findElement(By.name("firstname")).sendKeys("Koneru");

		driver.findElement(By.name("lastname")).sendKeys("Dummalwad");

		Thread.sleep(5000);

		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,200)");

		Thread.sleep(3000);

		WebElement click_male = 	driver.findElement(By.id("sex-0"));
		click_male.click();

		driver.findElement(By.xpath("//input[@id='exp-2']")).click();


		driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("20/08/1996");

		Thread.sleep(3000);

		boolean click_pro =  driver.findElement(By.xpath("//input[@id='profession-1']")).isSelected();

		System.out.println(click_pro);

		driver.findElement(By.xpath("//input[@id='profession-1']")).click();

		driver.findElement(By.xpath("//input[@id='tool-2']")).click();


		Thread.sleep(3000);

		Select sele = new Select(driver.findElement(By.xpath("//select[@id='continents']")));

		sele.selectByIndex(2);

		List<WebElement > all_option = sele.getOptions();

		System.out.println(all_option.size());

		for(int i = 0; i<all_option.size(); i++) {

			String all_text_world_name = all_option.get(i).getText();

			System.out.println(all_text_world_name);
		}

		System.out.println("All names has been printed successfully........");
		System.out.println("------------------------------------------------------------------------------------");
		Thread.sleep(5000);

		Select select = new Select(driver.findElement(By.xpath("(//select[@class='input-xlarge'])[2]")));

		select.deselectByIndex(2);

		List<WebElement> all_controls = select.getOptions();

		System.out.println(all_controls.size());

		for(int j = 0; j<all_controls.size(); j++) {

			String all_controls_text_print = 	all_controls.get(j).getText();

			System.out.println(all_controls_text_print);

		}

		System.out.println("all texts are primted successfully.....");
		System.out.println("-----------------------------------------------------------------------------------------------");

		driver.quit();
	}

}
