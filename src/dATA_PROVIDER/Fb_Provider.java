package dATA_PROVIDER;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Fb_Provider {
	public class Data_provider_Sample {
		
		
		WebDriver driver;
		
			
			@Test(dataProvider = "Login_Facebook")
			public void setup(String username, String password) throws InterruptedException {
				
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			    driver = new ChromeDriver();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
				driver.get("http://Facebook.com");
				
				driver.findElement(By.id("email")).sendKeys(username);
				driver.findElement(By.id("pass")).sendKeys(password);
				
				driver.findElement(By.linkText("Log In")).click();
				
				driver.navigate().back();
				System.out.println("The test case is passed successfuly............");
					
				System.out.println("All acconts hacked successfully.......");
				driver.quit();
  
       }
						
			  @DataProvider(name="Login_Facebook")
				public Object[][] fblogin() {
					
					Object[][] fblogin =  new Object[25][2];
					fblogin[0][0]="Ankita";
					fblogin[0][1]="Ankita@123";
					
					fblogin[1][0]="Soumys";
					fblogin[1][1]="Soumya@123";
					
					fblogin[2][0]="Sheetal";
					fblogin[2][1]="Sheetal@123";
					
					fblogin[3][0]="Rinkita";
					fblogin[3][1]="Rinkita@123";
					
					fblogin[4][0]="Sakshi";
					fblogin[4][1]="Skakshi@123";
					
					fblogin[5][0]="Sarika";
					fblogin[5][1]="Sujata@123";
					
					fblogin[6][0]="Pratiksha";
					fblogin[6][1]="Pratiksha@123";
					
					fblogin[7][0]="Prema";
					fblogin[7][1]="Premika@123";
					
					fblogin[8][0]="Mounami";
					fblogin[8][1]="Monika@123";
					
					fblogin[9][0]="Riya";
					fblogin[9][1]="Riyan@123";
					

					fblogin[10][0]="Riya";
					fblogin[10][1]="Riyan@123";
					
					fblogin[11][0]="Monika";
					fblogin[11][1]="Monika@123";
					
					fblogin[12][0]="Katrina";
					fblogin[12][1]="KatSallu123@gmail.com";
					
					
					fblogin[13][0]= "Meenakshi";
					fblogin[13][1]= "909890989 ";	
					
					fblogin[14][0]= "Monika ";
					fblogin[14][1]= "8988767879 ";	
				
					
					fblogin[15][0]= "Mounami";
					fblogin[15][1]= "8897898789 ";	
				
					fblogin[16][0]= "Soumya ";
					fblogin[16][1]= "9987876765 ";	
					
					
					fblogin[17][0]= "Bhagyashri ";
					fblogin[17][1]= "7767654567";	
					
					fblogin[18][0]= "Vaishnavi ";
					fblogin[18][1]= "6678758658 ";	
				
					fblogin[19][0]= "Vaishali ";
					fblogin[19][1]= "8876789097 ";	
				
					
					fblogin[20][0]= "Vartika ";
					fblogin[20][1]= "8889098789 ";	
				
					fblogin[21][0]= "Vidya ";
					fblogin[21][1]= "9990989807 ";	
				
					
					fblogin[22][0]= "Ananya ";
					fblogin[22][1]= " 9322899524";	
					
					
					fblogin[23][0]= "Saara ";
					fblogin[23][1]= "9322599807";	
					
					
					fblogin[24][0]= "Munmun ";
					fblogin[24][1]= "9322599801";	
			
					return fblogin;
				
				    }		  
			  
				}	
	}

			
	