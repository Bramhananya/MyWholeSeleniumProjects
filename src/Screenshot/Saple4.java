package Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saple4 {
	
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://google.com");
	
	TakesScreenshot googleshote = (TakesScreenshot)driver;
	File src  = googleshote.getScreenshotAs(OutputType.FILE);
	File destination = new File("c.\\Users\\defect1.bmp");
	
	//FileUtils.copyFile(src,destination);
    //FileHandler.Copy(src ,newFile("hgfhddfjrgf"));
	

	}

}
