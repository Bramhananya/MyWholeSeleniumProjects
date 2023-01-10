package Get_Title;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.linkText("Images")).click();
		
		String pgtitle = driver.getTitle();
		
		System.out.println(pgtitle);
		
		if(pgtitle.equalsIgnoreCase("google images"))
		{
			System.out.println("Images Link working, test pass");
		}else
		{
			System.out.println("Images Link not working, test fail");
		}
		driver.close();
		
	}

}
