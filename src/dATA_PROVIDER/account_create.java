package dATA_PROVIDER;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class account_create {
	
WebDriver driver;
	
	@Test(dataProvider = "fb_values")
	public void primary_yahoo_setup(String firstname, String lastname,String phonenumber,String newpasword) throws InterruptedException {
			
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://Facebook.com");
		System.out.println("Facebook login successfully.......");
		
		driver.findElement(By.id("email")).sendKeys("Noora Fatehi");
		driver.findElement(By.id("pass")).sendKeys("Noora@123");
		System.out.println("Names fiiled successfully............");
		
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		
		driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(phonenumber);
			
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(newpasword);
		System.out.println("All  datails filled successfully...........");
		
		Select date = new Select(driver.findElement(By.id("day")));
		date.selectByVisibleText("20");
		
	    List<WebElement> all_date= date.getOptions();
	    System.out.println(all_date.size());
	    
	    for(int i = 1; i<all_date.size(); i++) {
	    	
	   String print_all_date =	all_date.get(i).getText();
	   System.out.println(print_all_date);
	   
	    }
		
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("8");
		
	    List<WebElement> all_months= date.getOptions();
	    System.out.println(all_months.size());
	    
	    for(int i = 1; i<all_months.size(); i++) {
	    	
	   String print_all_months =	all_months.get(i).getText();
	   System.out.println(print_all_months);
	   
	    }
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1997");
		System.out.println("Date of Birthday filled successfully..........");	
			
	    List<WebElement> all_years = date.getOptions();
	    System.out.println(all_years.size());
	    
	    for(int i = 1; i<all_years.size(); i++) {
	    	
	   String print_all_year =	all_years.get(i).getText();
	   System.out.println(print_all_year);
	   
	    }
		
		WebElement element = driver.findElement(By.xpath("//input[@value='1']"));
		System.out.println(element.isSelected());
		element.click();
		System.out.println("Gendar clicked successfully...........");
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		driver.quit();
		
	}
	
	@DataProvider(name="fb_values")
	public Object[][] fb_data() {
		
		Object[][]login_fb = new Object[25][4];
		
		login_fb[0][0]= "Ankita ";
		login_fb[0][1]= "Sharma ";	
		login_fb[0][2]= "9767085683";	
		login_fb[0][3]= "Ankita @123";
		System.out.println("Details of Ankita...");
		
		login_fb[1][0]= "Riya ";
		login_fb[1][1]= "Chakravarty ";	
		login_fb[1][2]="907464859";
		login_fb[1][3]= "Riya@123 ";
		System.out.println("Details of Riya.....");
		
		login_fb[2][0]= "Poonam ";
		login_fb[2][1]= "Pandey ";	
		login_fb[2][2]="998473548";
		login_fb[2][3]= "Poonam@123 ";
		System.out.println("Details of Poonam....");
		
		login_fb[3][0]= "Sunny ";
		login_fb[3][1]= "Leone ";	
		login_fb[3][2]="908324765";
		login_fb[3][3]= "Sunny@123 ";
		System.out.println("Details of Sunny.....");
		
		login_fb[4][0]= "Kristein ";
		login_fb[4][1]= "Stewart ";	
		login_fb[4][2]="990864368";
		login_fb[4][3]= "Kristien@123 ";
		System.out.println("Details of Kristien....");
		
		login_fb[5][0]= "Aarti ";
		login_fb[5][1]= " Panchal";	
		login_fb[5][2]="7786785648";
		login_fb[5][3]= "Arti@123 ";
		System.out.println("Details of Arti.....");
		
		login_fb[6][0]= "Ananya ";
		login_fb[6][1]= "Patil ";	
		login_fb[6][2]="8876789876";
		login_fb[6][3]= "Ananya@123 ";
		System.out.println("Details of Ananya .......");
		
		login_fb[7][0]= "Shradha ";
		login_fb[7][1]= "Panchal";	
		login_fb[7][2]="9908764324";
		login_fb[7][3]= "Shradha@123 ";
		System.out.println("Details of Shradha.......");
		
		login_fb[8][0]= "Swatie ";
		login_fb[8][1]= "Deshmukh ";	
		login_fb[8][2]="9778988757";
		login_fb[8][3]= "Swatie@123 ";
		System.out.println("Details of Swatie........");
		
		login_fb[9][0]= "pretie ";
		login_fb[9][1]= "Singh";	
		login_fb[9][2]="9087654332";
		login_fb[9][3]= "Pretie@123 ";
		System.out.println("Details of Pretie......");
		
		login_fb[10][0]= "Priya ";
		login_fb[10][1]= " Panchal";	
		login_fb[10][2]="9089809870";
		login_fb[10][3]= "Priya@123 ";
		System.out.println("Details of Priya......");
		
		login_fb[11][0]= "Divya";
		login_fb[11][1]= "Bharti ";	
		login_fb[11][2]="8879856452";
		login_fb[11][3]= "Divya@123 ";
		System.out.println("Details of Divya......");
		
		login_fb[12][0]= "Sandya ";
		login_fb[12][1]= "Rathi ";	
		login_fb[12][2]="9767097438";
		login_fb[12][3]= "Sandya@123 ";
		System.out.println("Details of Sandya......");
		
		login_fb[13][0]= "Meenakshi";
		login_fb[13][1]= "Panchal ";	
		login_fb[13][2]="909890989";
		login_fb[13][3]= "Meenakshi@123 ";
		System.out.println("Details of Menakshi......");
		
		login_fb[14][0]= "Monika ";
		login_fb[14][1]= "kadam ";	
		login_fb[14][2]="8988767879";
		login_fb[14][3]= "Monika@123 ";
		System.out.println("Details of Monika......");
		
		login_fb[15][0]= "Mounami";
		login_fb[15][1]= "Horke ";	
		login_fb[15][2]="8897898789";
		login_fb[15][3]= "Mounami@123";
		System.out.println("Details of Mounami......");
		
		login_fb[16][0]= "Soumya ";
		login_fb[16][1]= "Horke ";	
		login_fb[16][2]="9987876765";
		login_fb[16][3]= "Soumya@123 ";
		System.out.println("Details of Soumya......");
		
		login_fb[17][0]= "Bhagyashri ";
		login_fb[17][1]= "Deshmukh";	
		login_fb[17][2]="7767654567";
		login_fb[17][3]= "Bhagyashreea@123 ";
		System.out.println("Details of Bhagyashri......");
		
		login_fb[18][0]= "Vaishnavi ";
		login_fb[18][1]= "Mundhe ";	
		login_fb[18][2]="6678758658";
		login_fb[18][3]= "Vaishnavi@123 ";
		System.out.println("Details of Vaishnavi......");
		
		login_fb[19][0]= "Vaishali ";
		login_fb[19][1]= "Pawar ";	
		login_fb[19][2]="8876789097";
		login_fb[19][3]= "Vaishali@123 ";
		System.out.println("Details of Vaishali......");
		
		login_fb[20][0]= "Vartika ";
		login_fb[20][1]= "Deshmukh ";	
		login_fb[20][2]="8889098789";
		login_fb[20][3]= "Vartika@2123 ";
		System.out.println("Details of Vertika......");
		
		login_fb[21][0]= "Vidya ";
		login_fb[21][1]= "Balan ";	
		login_fb[21][2]="9990989807";
		login_fb[21][3]= "Vidya@123 ";
		System.out.println("Details of Vidya......");
		
		login_fb[22][0]= "Ananya ";
		login_fb[22][1]= " Pandey";	
		login_fb[22][2]="9322899524";
		login_fb[22][3]= "Ananyat@134 ";
		System.out.println("Details of Anannya......");
		
		login_fb[23][0]= "Saara ";
		login_fb[23][1]= "Khan ";	
		login_fb[23][2]="9322599807";
		login_fb[23][3]= "Sarra@123 ";
		System.out.println("Details of Sarra......");
		
		login_fb[24][0]= "Munmun ";
		login_fb[24][1]= "Datta";	
		login_fb[24][2]="9322599801";
		login_fb[24][3]= "Mumnmun@123 ";
		System.out.println("Details of Munmun...........");
		
		return login_fb;
	}
}
