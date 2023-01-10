package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class yahoo_provider {
	

	WebDriver driver;
	
	@Test(dataProvider = "Creating_yahoo_account")
	public void primary_yahoo_setup(String firstname, String yahoomail, String password, String year) throws InterruptedException {
			
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://login.yahoo.com");
		String url = driver.getCurrentUrl();
		System.out.println("The current url is => " + url );
		
		Thread.sleep(2000);
		driver.findElement(By.id("createacc")).click();
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).clear();
		driver.findElement(By.xpath("//input[@id='usernamereg-userId']")).sendKeys(yahoomail);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@name='birthYear']")).clear();
		driver.findElement(By.xpath("//input[@name='birthYear']")).sendKeys(year);
	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@class='privacyLink']")).click();	
		driver.navigate().back();
		
		driver.quit();
	}
	
	
	
	//https://treasurynet.mahakosh.gov.in/treasurynet/
	
	@DataProvider(name="Creating_yahoo_account")
	public Object[][] login_yaho() {
		
		Object[][] login_yahoo = new Object[8][4];
		
		login_yahoo[0][0]= "Ankita ";
		login_yahoo[0][1]= "Sharma ";	
		login_yahoo[0][2]= "9767085683";	
		login_yahoo[0][3]= "Ankita @123";
		System.out.println("Details of Ankita...");
		
		login_yahoo[1][0]= "Riya ";
		login_yahoo[1][1]= "Chakravarty ";	
		login_yahoo[1][2]="907464859";
		login_yahoo[1][3]= "Riya@123 ";
		System.out.println("Details of Riya.....");
		
		login_yahoo[2][0]= "Poonam ";
		login_yahoo[2][1]= "Pandey ";	
		login_yahoo[2][2]="998473548";
		login_yahoo[2][3]= "Poonam@123 ";
		System.out.println("Details of Poonam....");
		
		login_yahoo[3][0]= "Sunny ";
		login_yahoo[3][1]= "Leone ";	
		login_yahoo[3][2]="908324765";
		login_yahoo[3][3]= "Sunny@123 ";
		System.out.println("Details of Sunny.....");
		
		login_yahoo[4][0]= "Kristein ";
		login_yahoo[4][1]= "Stewart ";	
		login_yahoo[4][2]="990864368";
		login_yahoo[4][3]= "Kristien@123 ";
		System.out.println("Details of Kristien....");
		
		login_yahoo[5][0]= "Aarti ";
		login_yahoo[5][1]= " Panchal";	
		login_yahoo[5][2]="7786785648";
		login_yahoo[5][3]= "Arti@123 ";
		System.out.println("Details of Arti.....");
		
		login_yahoo[6][0]= "Ananya ";
		login_yahoo[6][1]= "Patil ";	
		login_yahoo[6][2]="8876789876";
		login_yahoo[6][3]= "Ananya@123 ";
		System.out.println("Details of Ananya .......");
		
		login_yahoo[7][0]= "Shradha ";
		login_yahoo[7][1]= "Panchal";	
		login_yahoo[7][2]="9908764324";
		login_yahoo[7][3]= "Shradha@123 ";
		System.out.println("Details of Shradha.......");
		
		
		return login_yahoo;
	}
}
