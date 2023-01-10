package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample111 {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://treasurynet.mahakosh.gov.in/treasurynet/frmlogin.php");
		
	Thread.sleep(3000);
				
		driver.findElement(By.id("txtUser")).sendKeys("hanmant");
		driver.findElement(By.id("txtPwd")).sendKeys("Hanmanat@123");
		
		Thread.sleep(3000);
		
		org.openqa.selenium.support.ui.Select element = new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id='trea_code']")));
		
	List<WebElement> elements = 	element.getOptions();
	System.out.println(elements.size());
		
		System.out.println("All size has printed successfully.....");
		System.out.println("--------------------------------------------------------------------------------");
		
		for(int i= 0; i<elements.size(); i++) {
			
	String all_text =		elements.get(i).getText();
	
	System.out.println(all_text);
	
		}
		
		System.out.println("All text printed successfully.......");
		
		System.out.println("----------------------------------------------------------------------------------------");
		
		Thread.sleep(3000);
		
	String text = 	driver.findElement(By.xpath("//*[contains(text(),'Government')]")).getTagName();
	System.out.println(text);
     	System.out.println("-----------------------------------------------------------------------------------------");	
	
	Thread.sleep(3000);
		String text_print = 	driver.findElement(By.xpath("(//p[@align='justify'])[2]")).getText();
		System.out.println(text_print);
	    System.out.println("------------------------------------------------------------------------------------------");
	
		Thread.sleep(3000);
	  driver.findElement(By.xpath("(//input[@class='input-button'])[1]")).click();
		
	Thread.sleep(5000);
		
      String alert_text_print = 	driver.switchTo().alert().getText();
	   System.out.println(alert_text_print);
	   System.out.println("All text is printed successfully........");
	   System.out.println("-------------------------------------------------------------------------------------------");
	
	  Thread.sleep(5000);
		driver.switchTo().alert().accept();
		
		System.out.println("Alert is handled successfully......");
		System.out.println("-------------------------------------------------------------------------------------------");
		
		System.out.println("All options are handled here successfully.........");
		System.out.println("--------------------------------------------------------------------------------------------");
	
		Thread.sleep(5000);
		driver.quit();
	}

}
