package Select_Class;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Orange_HRM {
	
	WebDriver driver;
	
	
	@Test(dataProvider = "Orange_values")
	public  void set_up_orangeHRM(String emp_name, String emp_id, String emp_supervisername) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver = new ChromeDriver();		
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://orangehrm.qedgetech.com/");
	
	System.out.println("Link is opened successfully");
	
	String url = driver.getCurrentUrl();
	System.out.println("The current url is => " + url);
	
	Thread.sleep(2000);
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
	
	System.out.println("Username and the password filled successfully..........");
	
	Thread.sleep(2000);
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.linkText("PIM")).click();

	driver.findElement(By.xpath("//input[@name='empsearch[employee_name][empName]']")).clear();
	driver.findElement(By.xpath("//input[@name='empsearch[employee_name][empName]']")).sendKeys(emp_name);
	
	driver.findElement(By.xpath("//input[@id='empsearch_id']")).clear();
	driver.findElement(By.xpath("//input[@id='empsearch_id']")).sendKeys(emp_id);
	
	driver.findElement(By.xpath("//input[@name='empsearch[supervisor_name]']")).clear();
    driver.findElement(By.xpath("//input[@name='empsearch[supervisor_name]']")).sendKeys(emp_supervisername);
    
    System.out.println("All the datas filled successfully..........");
    
   Thread.sleep(3000);	
   driver.findElement(By.name("empsearch[job_title]")).click();
	Select sele = new Select(driver.findElement(By.name("empsearch[job_title]")));
	
	List<WebElement> alllist =  sele.getOptions();
	
	System.out.println(alllist.size());
	
	for(int i = 0; i<alllist.size(); i++) {
		
    String allnames = alllist.get(i).getText();
    System.out.println("Allnames are => " + allnames);
		
	}
	
	System.out.println("All name list is printed successfully........");
	
	Thread.sleep(2000);
	driver.findElement(By.id("empsearch_employee_status")).click();
    Select sele2 = new Select(driver.findElement(By.id("empsearch_employee_status")));
	
	List<WebElement> alllist2 =  sele2.getOptions();
	
	System.out.println(alllist2.size());
	
	for(int i = 0; i<alllist2.size(); i++) {
		
    String allnamess = alllist2.get(i).getText();
    System.out.println("Allnames are => " + allnamess);
    
	}
	
	System.out.println("All lists are printed ___ __ __ __ __ ___ __");
	
	Thread.sleep(2000);
	driver.findElement(By.id("empsearch_termination")).click();
	 Select sele3 = new Select(driver.findElement(By.id("empsearch_employee_status")));
		
		List<WebElement> alllist3 =  sele3.getOptions();
		
		System.out.println(alllist3.size());
		
		for(int i = 0; i<alllist3.size(); i++) {
			
	    String allnamesss = alllist2.get(i).getText();
	    System.out.println("Allnamess are => " + allnamesss);
	
		}
		
     driver.navigate().back();
    
	}	
		
	@DataProvider(name="Orange_values")
	public Object[][] HRM_data_fill() {
		
		Object[][]HRM_data = new Object[25][3];
		
		HRM_data[0][0]= "Ankita ";
		HRM_data[0][1]= "9767085683 ";	
		HRM_data[0][2]= "Mayuri";	
		System.out.println("Details of Ankita......");
		
		HRM_data[1][0]= "Riya ";
		HRM_data[1][1]= "907464859 ";	
		HRM_data[1][2]="Mayuri";
		System.out.println("Details of Riya.....");
		
		HRM_data[2][0]= "Poonam ";
		HRM_data[2][1]= "998473548 ";	
		HRM_data[2][2]="Mayuri";
		System.out.println("Details of Poonam....");
		
		HRM_data[3][0]= "Sunny ";
		HRM_data[3][1]= "908324765 ";	
		HRM_data[3][2]="Mayuri";
		System.out.println("Details of Sunny.....");
		
		HRM_data[4][0]= "Kristein ";
		HRM_data[4][1]= "990864368 ";	
		HRM_data[4][2]="Mayuri";
		System.out.println("Details of Kristien....");
		
		HRM_data[5][0]= "Aarti ";
		HRM_data[5][1]= " 7786785648";	
		HRM_data[5][2]="Mayuri";
		System.out.println("Details of Arti.....");
		
		HRM_data[6][0]= "Ananya ";
		HRM_data[6][1]= "8876789876 ";	
		HRM_data[6][2]="Mayuri";
		System.out.println("Details of Ananya .......");
		
		HRM_data[7][0]= "Shradha ";
		HRM_data[7][1]= "9908764324";	
		HRM_data[7][2]="Mayuri";	
		System.out.println("Details of Shradha.......");
		
		HRM_data[8][0]= "Swatie ";
		HRM_data[8][1]= "9778988757 ";	
		HRM_data[8][2]="Mayuri";		
		System.out.println("Details of Swatie........");
		
		HRM_data[9][0]= "pretie ";
		HRM_data[9][1]= "9087654332";	
		HRM_data[9][2]="Mayuri";
		System.out.println("Details of Pretie......");
		
		HRM_data[10][0]= "Priya ";
		HRM_data[10][1]= " 9089809870";	
		HRM_data[10][2]="9089809870";
		System.out.println("Details of Priya......");
		
		HRM_data[11][0]= "Divya";
		HRM_data[11][1]= "8879856452 ";	
		HRM_data[11][2]="Mayuri";
		System.out.println("Details of Divya......");
		
		HRM_data[12][0]= "Sandya ";
		HRM_data[12][1]= "9767097438 ";	
		HRM_data[12][2]="Mayuri";
		System.out.println("Details of Sandya......");
		
		HRM_data[13][0]= "Meenakshi";
		HRM_data[13][1]= "909890989 ";	
		HRM_data[13][2]="Mayuri";
		System.out.println("Details of Menakshi......");
		
		HRM_data[14][0]= "Monika ";
		HRM_data[14][1]= "8988767879 ";	
		HRM_data[14][2]="Mayuri";	
		System.out.println("Details of Monika......");
		
		HRM_data[15][0]= "Mounami";
		HRM_data[15][1]= "8897898789 ";	
		HRM_data[15][2]="8897898789";	
		System.out.println("Details of Mounami......");
		
		HRM_data[16][0]= "Soumya ";
		HRM_data[16][1]= "9987876765 ";	
		HRM_data[16][2]="Mayuri";
		System.out.println("Details of Soumya......");
		
		HRM_data[17][0]= "Bhagyashri ";
		HRM_data[17][1]= "7767654567";	
		HRM_data[17][2]="7767654567";
		System.out.println("Details of Bhagyashri......");
		
		HRM_data[18][0]= "Vaishnavi ";
		HRM_data[18][1]= "6678758658 ";	
		HRM_data[18][2]="Mayuri";
		System.out.println("Details of Vaishnavi......");
		
		HRM_data[19][0]= "Vaishali ";
		HRM_data[19][1]= "8876789097 ";	
		HRM_data[19][2]="Mayuri";	
		System.out.println("Details of Vaishali......");
		
		HRM_data[20][0]= "Vartika ";
		HRM_data[20][1]= "8889098789 ";	
		HRM_data[20][2]="Mayuri";	
		System.out.println("Details of Vertika......");
		
		HRM_data[21][0]= "Vidya ";
		HRM_data[21][1]= "9990989807 ";	
		HRM_data[21][2]="Mayuri";	
		System.out.println("Details of Vidya......");
		
		HRM_data[22][0]= "Ananya ";
		HRM_data[22][1]= " 9322899524";	
		HRM_data[22][2]="Mayuri";
		System.out.println("Details of Anannya......");
		
		HRM_data[23][0]= "Saara ";
		HRM_data[23][1]= "9322599807";	
		HRM_data[23][2]="Mayuri";
		System.out.println("Details of Sarra......");
		
		HRM_data[24][0]= "Munmun ";
		HRM_data[24][1]= "9322599801";	
		HRM_data[24][2]="Mayuri";
		System.out.println("Details of Munmun...........");
		
		return HRM_data;     
   
	}
}
