package Test_Ng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amezon {

	WebDriver driver;

	@BeforeMethod
	public void Amezon_Test() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");

		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		System.out.println("the link is working");
		driver.findElement(By.linkText("See All")).click();

		Thread.sleep(5000);

	}

	@Test(priority = 1)
	public void click_Electronics() {
		driver.findElement(By.linkText("Electronics")).click();
		String	title1 =driver.getTitle();
		System.out.println("link is working " + title1);

	}

	@Test(priority = 2)
	public void Clicl_com() {
		driver.findElement(By.linkText("Computers")).click();
		String	title2 =driver.getTitle();
		System.out.println("link is working " + title2);
	}

	@Test(priority = 3)
	public void Smart() {
		driver.findElement(By.linkText("Smart Home")).click();
		String	title3 =driver.getTitle();
		System.out.println("link is working " + title3);
	}


	@Test(priority = 4)	
	public void Click_SeeAll() {
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[11]/a[1]/i")).click();
		System.out.println("link is working");	
		String	title4 =driver.getTitle();
		System.out.println("link is working " + title4);

	}

	@Test(priority = 5)
	public void  baby_click() {
		driver.findElement(By.linkText("Baby")).click();	
		String	title5 =driver.getTitle();
		System.out.println("link is working " + title5);
	}


	@Test(priority = 6)
	public void accont() throws InterruptedException {
		driver.findElement(By.linkText("Your Account")).click();
		System.out.println("above link is working");
		Thread.sleep(3000);
	}

	@Test(priority = 7)
	public void click() {
		driver.findElement(By.linkText("Sell")).click();
		System.out.println("the link is working");
	}

	@AfterMethod
	public void  Set_up_Close() {
		driver.quit();
	}


}
