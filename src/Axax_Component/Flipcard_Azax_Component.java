package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipcard_Azax_Component {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
	WebElement getsize =	driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
	getsize.sendKeys("iphones");
		
	WebElement serch_iphones =	driver.findElement(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
		
	List<WebElement> all_serch_phones = driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1 _38UFBk']"));
	System.out.println(all_serch_phones.size());
	
	for( WebElement all_suggession_list  : all_serch_phones) {
		
		System.out.println(all_suggession_list.getSize());
		System.out.println("----------------------------------------------------------------------------");
		
		String all_text_print = all_suggession_list.getText();
		System.out.println(all_text_print);
	}
	System.out.println("------------------------------------------------------------------------------");
	
	Thread.sleep(3000);
	
	for(int i =0; i<=all_serch_phones.size(); i++) {
		
		   
		if(all_serch_phones.get(i).getText().toLowerCase().contains("iphone 13 pro max"));
		all_serch_phones.get(i).click();
		break;	
		
	}
		
		System.out.println(" iphone 13 pro max 12 mini has clicked successfully.....");
		
		Thread.sleep(4000);
		driver.quit();  
	}

}
