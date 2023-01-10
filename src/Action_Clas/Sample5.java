package Action_Clas;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dshrikant.action;

public class Sample5 {
	
	public static void main (String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chromdriver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://snapdeal.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='inputValEnter']")).sendKeys("men's watch");
		driver.findElement(By.xpath("//*[@class='searchformButton col-xs-4 rippleGrey']")).click();
				
		Thread.sleep(3000);
		//System.out.println("The test case is completed.......");
		driver.navigate().back();
		
        Thread.sleep(3000);
      
		Actions act = new Actions(driver);
	    act.moveToElement(driver.findElement(By.linkText("Hobbies")));
	    act.contextClick();
	    act.build().perform();
	    
	    driver.findElement(By.linkText("Collectibles")).click();
	    Thread.sleep(3000);
	    
	   driver.findElement(By.xpath("//*[@class='sort-selected']")).click();
	    Thread.sleep(5000);
	    
	   Actions act2 = new Actions(driver);
	    act2.moveToElement(driver.findElement(By.linkText("Discount")));
	    act2.build().perform();
	        
	//    driver.findElement(By.linkText("Discount")).click();
	    
	    
	    /*Select sele = new Select(driver.findElement(By.xpath("//div[@class='sort-selected']")));
       sele.selectByIndex(3);*/
	    
		driver.quit();
		
	}

}
