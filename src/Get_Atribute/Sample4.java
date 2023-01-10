package Get_Atribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample4 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://calc.qedgetech.com");
		
		driver.findElement(By.xpath("//input[@id='btn' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@id='btn' and @value='+']")).click();
		driver.findElement(By.xpath("//input[@id='btn' and @value='2']")).click();
		driver.findElement(By.xpath("//input[@id='btn' and @value='=']")).click();
		
		String res =  driver.findElement(By.name("display")).getAttribute("value");
		System.out.println(res);
	}

}
