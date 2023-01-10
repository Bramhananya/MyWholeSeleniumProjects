package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample5 {
	
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();		
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://amazon.com");

	String expval = "Cars";

    Select cat= new Select(driver.findElement(By.id("searchDropdownBox")));
	List<WebElement> catlist = cat.getOptions();
	
	boolean isitem_present = false;
	
	for(int i=0;i<catlist.size();i++)
	{
		String actval = catlist.get(i).getText();
		if(expval.equalsIgnoreCase(actval))
		{
			isitem_present = true;
			break;
		}
	}
	if(isitem_present)
	{
		System.out.println(expval+" is present in the list, test pass"); 
	}else
	{
		System.out.println(expval+" is not present in the list, test fail");
	}
	driver.quit();
	}
}
