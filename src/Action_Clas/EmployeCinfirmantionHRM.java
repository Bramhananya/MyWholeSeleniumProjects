package Action_Clas;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmployeCinfirmantionHRM {

	public static void main(String[] args) throws InterruptedException   {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		driver.get("http://orangehrm.qedgetech.com");

		String expectedTitle = "OrangeHRM";

		String actualTitle =   driver.getTitle().toLowerCase();  
		System.out.println(actualTitle);

		if(expectedTitle.contains("OrangeHRM")) {
			System.out.println("Pass: We are on the real page.");
		}else {
			System.err.println("Fail: We are on the wrong page");
		}


		Thread.sleep(2000);


		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("Qedge123!@#");

		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		driver.findElement(By.linkText("PIM")).click();

		driver.findElement(By.linkText("Employee List")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Bhimashankar");

		Thread.sleep(7000);

		String  expectedname ;

		expectedname =    driver.findElement(By.xpath("//li[@class='ac_even']")).getText().toLowerCase();

		System.out.println("Pass : text is present");

		if ( driver.findElement(By.xpath("//li[@class='ac_even']")).getText().toLowerCase() != null) {

			expectedname.contains("Bhimashankar Nilkant");

			System.out.println("Pass : Employee registerd successfully...."); 
		}else {

			System.out.println("Fail : Please registre once agin ");
		}

		driver.close();
		driver.quit();
	}

}
