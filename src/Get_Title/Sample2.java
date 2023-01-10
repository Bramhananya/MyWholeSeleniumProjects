package Get_Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample2 {
	
	 public static void main (String[]args) throws InterruptedException{

		 System.setProperty("wbdriver.chrome.driver","Chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.manage().deleteAllCookies();
		 driver.get("http://Google.com");
		 
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.linkText("About")).click();
	    String text = driver.findElement(By.xpath("/html/body/main/div/section[2]/div/h1")).getText();
	
	    System.out.println(text);
	    Thread.sleep(3000);
	    
	    String text2 = driver.findElement(By.className("gradient-overlay")).getText();
	    System.out.println(text2);
		driver.quit();

		 }
}
