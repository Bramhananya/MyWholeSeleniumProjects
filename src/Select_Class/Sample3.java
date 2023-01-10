package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://amazon.com");

		Select cat = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		List<WebElement> catlist = cat.getOptions();
		
		//Counting No. of items present in a dropdownlist
		System.out.println(catlist.size());
		
		//Accessing elements present in a List
		for(int i=0;i<catlist.size();i++)
		{
			String catname =  catlist.get(i).getText();
			System.out.println(catname);
		}
	}

}
             