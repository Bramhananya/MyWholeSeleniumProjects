package Select_Class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://facebook.com");
				
		//Select x = new Select(driver.findElement(By.id("cars")));
		
		WebElement carelement= driver.findElement(By.id("cars"));
		Select x = new Select(carelement);
		
		
		//x.selectByIndex(1);
		//x.selectByVisibleText("BMW");
		//x.selectByValue("a");
		
		 java.util.List<WebElement> carlist = x.getOptions();
		 System.out.println(carlist.size()-1);
		
		 for(int i=1;i<carlist.size();i++)
		 {
			 String carname = carlist.get(i).getText();
			 System.out.println(carname);
		 }
	}

}
