package X_Path;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.source.tree.DoWhileLoopTree;

public class Starts_With2 {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
	java.util.List<WebElement> elementlist = driver.findElements(By.xpath("//input[starts-with(@id,'ohrmList_chkSelectRecord')]"));
		for(WebElement element : elementlist)
		{
			element.click();
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/form/div[1]/ul/li[10]/a")).click();
		
		
		java.util.List<WebElement> allelements = driver.findElements(By.name("chkSelectAll"));

	for(WebElement all : allelements) {
			
			all.click();	
		}
	
		

	}	
	
}
