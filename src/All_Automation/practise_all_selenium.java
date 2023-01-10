package All_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practise_all_selenium {

	public static void main (String[]args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));

		driver.manage().deleteAllCookies();

		driver.get("https://www.qafox.com/");

		String  title_of_the_page =  driver.getTitle();
		System.out.println("Tithe is => " + title_of_the_page);

		Thread.sleep(2000);

		String current_page_url = 	driver.getCurrentUrl();
		System.out.println("Url of thr page is => " + current_page_url);


		Thread.sleep(3000);

		if(driver.findElement(By.xpath("//img[@itemprop='logo']")).isDisplayed()) {

			System.out.println("We are on the right page.");
		}else {
			System.out.println("Please chrck the new url");
		}

		System.out.println("-----------------------------------------------------------------------------------------------");

		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[5]")));
		act.build().perform();

		Thread.sleep(5000);

		java.util.List<WebElement> all_courses_list  = 	driver.findElements(By.xpath("//li[@id='menu-item-1073']"));

		for( WebElement all_corses_print  : all_courses_list) {

			String all_text_print_courses = all_corses_print.getText();

			System.out.println(all_text_print_courses);

			if(all_text_print_courses.contains("SELENIUM FOR BEGINNERS (FREE)")) {

				all_corses_print.click();

			}
		}

		System.out.println("-----------------------------------------------------------------------------------------------");

		System.out.println("All texts are printes successfully.......");

		driver.navigate().back();

		Thread.sleep(5000);

		act.moveToElement(driver.findElement(By.xpath("(//a[@class='sf-with-ul'])[6]")));
		act.build().perform();

		java.util.List<WebElement> all_second_list = driver.findElements(By.xpath("//li[@id='menu-item-4247']"));

		for(WebElement  second_list : all_second_list) {

			String print_all_list = second_list.getText();
			System.out.println(print_all_list);

			if(print_all_list.contains("MOBILE TESTING")) {

				second_list.click();
			}
		}

		System.out.println("All second list has printed out");

		System.out.println("-----------------------------------------------------------------------------------------------");

		driver.navigate().back();
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Ashwini");

		Thread.sleep(3000);

		act.moveToElement(driver.findElement(By.xpath("(//i[@class='fa fa-home'])[4]")));
		act.contextClick();
		act.build().perform();

		System.out.println("Performed right click actions successfully.....");

		Thread.sleep(3000);

		JavascriptExecutor java = (JavascriptExecutor)driver;
		java.executeScript("window.scrollBy(0,500)");

		Thread.sleep(3000);

		java.executeScript("window.scrollBy(0,100)");
		Thread.sleep(3000);

		java.executeScript("window.scrollBy(0,2000)");
		Thread.sleep(3000);

		System.out.println("The page is successfully scroolled by this method ");

		System.out.println("----------------------------------------------------------------------------------------------");

		String print_all_texts =	driver.findElement(By.xpath("//div[contains(text(),'Our goal is to make')]")).getText();

		System.out.println(" The text is => " + print_all_texts );

		System.out.println("All texts are printed successfully.....");

		System.out.println("----------------------------------------------------------------------------------------------");

		Thread.sleep(3000);

		java.executeScript("window.scrollBy(0,-2600)");

		driver.findElement(By.id("search-submit")).click();

		         try {

		                 	driver.findElement(By.xpath("//input[@value='Ashwini']")).isDisplayed();

		                	System.out.println("We are on the current page");

		         } catch (Exception e) {

		                 	System.out.println("No Page Found Exception" );
	              	}

		Thread.sleep(5000);

		java.executeScript("window.scrollBy(0,1000)");

		System.out.println("Scrooled after the handling the exception");

		Thread.sleep(3000);
		
		System.out.println("Code is completed");
		
		driver.quit();

	}

}
