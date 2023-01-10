package Get_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample3 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/");
		driver.findElement(By.linkText("About us")).click();
		
		String x = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[2]/p[2]")).getText();
		System.out.println(x);
		
	}

}
