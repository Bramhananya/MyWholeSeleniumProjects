package dshrikant;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();	
		
		driver.get("https://jqueryui.com/");
		
		Actions act =new Actions(driver);   
		
		driver.findElement(By.linkText("Droppable")).click();
		driver.switchTo().frame(0);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("draggable"));
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().parentFrame();
		
		Thread.sleep(3000);
        WebElement dd=driver.findElement(By.linkText("Contribute"));
		act.moveToElement(dd).perform();
		
		System.out.println("completed");

	}

}
