package dATA_PROVIDER;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class snapchat_provider {
	
	WebDriver driver;
	
	@Test(dataProvider ="provide_sanap_data")
     public void set_up_snapchat(String firstname, String lastname, String username,String password,String email, String day, String year) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	    driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); 
		driver.navigate().refresh();
		
	    driver.get("https://forbusiness.snapchat.com/");
	
	    String url = driver.getCurrentUrl();
        System.out.println(url);
   
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@class='icon-waffle']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Snap AR']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Pixy']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Spectacles']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Developers']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Snap Inc.']")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//summary[@title='Creators']")).click();
		
		System.out.println("All links are successfully clicked......");
		
	
		driver.findElement(By.xpath("//*[@class='icon-close']")).click();
		
	driver.findElement(By.xpath("/html/body/main/header/aside/a[2]")).click();
		
		Thread.sleep(2000);
		
	Select sele = new Select(driver.findElement(By.xpath("//select[@name='birthdayMonth']")));
		
		List<WebElement> all_month_list = sele.getOptions();
		System.out.println(all_month_list.size());
		
		for(int i = 1; i<all_month_list.size(); i++) {
			
	   String	monthhs =	all_month_list.get(i).getText();
	   System.out.println(monthhs);
	  
		}
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='firstName']")).clear();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@name='lastName']")).clear();
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@name='username']")).clear();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@name='password']")).clear();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		
		
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(email);
		
		driver.findElement(By.xpath("//input[@name='birthdayDay']")).clear();
		driver.findElement(By.xpath("//input[@name='birthdayDay']")).sendKeys(day);
		
		driver.findElement(By.xpath("//input[@name='birthdayYear']")).clear();
		driver.findElement(By.xpath("//input[@name='birthdayYear']")).sendKeys(year);
		
		Thread.sleep(2000);
		driver.navigate().back();
	}	

		@DataProvider(name="provide_sanap_data")
		public Object[][] snapchat() {
			
			Object[][]snap_data = new Object[13][7];
			
			snap_data[0][0]= "Ankita ";
			snap_data[0][1]= "Sharma ";	
			snap_data[0][2]= "Ankita @123";	
			snap_data[0][3]= "Ankita @123";
			snap_data[0][4]= "Ankita @gmail.123";
			snap_data[0][5]= "1 ";	
			snap_data[0][6]= "1990 ";			
			System.out.println("Details of Ankita...");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[1][0]= "Riya ";
			snap_data[1][1]= "Chakravarty ";	
			snap_data[1][2]="907464859";
			snap_data[1][3]= "Riya@123 ";
			snap_data[1][4]= "Ankita @gmail123";
			snap_data[1][5]= "2 ";	
			snap_data[1][6]= "1999 ";	
			System.out.println("Details of Riya.....");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[2][0]= "Poonam ";
			snap_data[2][1]= "Pandey ";	
			snap_data[2][2]="998473548";
			snap_data[2][3]= "Poonam@123 ";	
			snap_data[2][4]= "Ankita @gmail123";
			snap_data[2][5]= "3 ";	
			snap_data[2][6]= "1900 ";	
			System.out.println("Details of Poonam....");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[3][0]= "Sunny ";
			snap_data[3][1]= "Leone ";	
			snap_data[3][2]="908324765";
			snap_data[3][3]= "Sunny@123 ";
			snap_data[3][4]= "Ankita @gmail123";
			snap_data[3][5]= "4 ";	
			snap_data[3][6]= "1991";	
			System.out.println("Details of Sunny.....");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[4][0]= "Kristein ";
			snap_data[4][1]= "Stewart ";	
			snap_data[4][2]="990864368";
			snap_data[4][3]= "Kristien@123 ";
			snap_data[4][4]= "Ankita @123";
			snap_data[4][5]= "5 ";
			snap_data[4][6]= "1993 ";	
			System.out.println("Details of Kristien....");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[5][0]= "Aarti ";
			snap_data[5][1]= " Panchal";	
			snap_data[5][2]="7786785648";
			snap_data[5][3]= "Arti@123 ";
			snap_data[5][4]= "Ankita @gmail123";
			snap_data[5][5]= "6 ";
			snap_data[5][6]= "1992 ";	
			System.out.println("Details of Arti.....");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[6][0]= "Ananya ";
			snap_data[6][1]= "Patil ";	
			snap_data[6][2]="8876789876";
			snap_data[6][3]= "Ananya@123 ";
			snap_data[6][4]= "Ankita @gmail123";
			snap_data[6][5]= "7 ";	
			snap_data[6][6]= "1994";	
			System.out.println("Details of Ananya .......");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[7][0]= "Shradha ";
			snap_data[7][1]= "Panchal";	
			snap_data[7][2]="9908764324";
			snap_data[7][3]= "Shradha@123 ";
			snap_data[7][4]= "Ankita @gmail123";
			snap_data[7][5]= "8 ";	
			snap_data[7][6]= "1995 ";	
			System.out.println("Details of Shradha.......");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[8][0]= "Swatie ";
			snap_data[8][1]= "Deshmukh ";	
			snap_data[8][2]="9778988757";
			snap_data[8][3]= "Swatie@123 ";
			snap_data[8][4]= "Ankita @gmail123";
			snap_data[8][5]= "9 ";	
			snap_data[8][6]= "1996 ";	
			System.out.println("Details of Swatie........");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[9][0]= "pretie ";
			snap_data[9][1]= "Singh";	
			snap_data[9][2]="9087654332";
			snap_data[9][3]= "Pretie@123 ";
			snap_data[9][4]= "Ankita @gmail123";
			snap_data[9][5]= "10 ";	
			snap_data[9][6]= "1997 ";	
			System.out.println("Details of Pretie......");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[10][0]= "Priya ";
			snap_data[10][1]= " Panchal";	
			snap_data[10][2]="9089809870";
			snap_data[10][3]= "Priya@123 ";
			snap_data[10][4]= "Ankita @gmail123";
			snap_data[10][5]= "11 ";	
			snap_data[10][6]= "1998";	
			System.out.println("Details of Priya......");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[11][0]= "Divya";
			snap_data[11][1]= "Bharti ";	
			snap_data[11][2]="8879856452";
			snap_data[11][3]= "Divya@123 ";
			snap_data[11][4]= "Ankita @gmail123";
			snap_data[11][5]= "12 ";	
			snap_data[11][6]= "1999 ";	
			System.out.println("Details of Divya......");
			System.out.println("---------------------------------------------------------------------------------------------------");
			
			snap_data[12][0]= "Sandya ";
			snap_data[12][1]= "Rathi ";	
			snap_data[12][2]="9767097438";
			snap_data[12][3]= "Sandya@123 ";
			snap_data[12][4]= "Ankita @gmail123";
			snap_data[12][5]= "13 ";	
			snap_data[12][6]= "1990";	
			System.out.println("Details of Sandya......");
			System.out.println("---------------------------------------------------------------------------------------------------");
		
			return snap_data ;		
		
	}
}









