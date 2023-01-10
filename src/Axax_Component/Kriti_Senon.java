package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kriti_Senon {

	public static void main (String[]args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();	 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.navigate().to("https://Google.com");

		Thread.sleep(3000);

		if(driver.findElement(By.xpath("(//a[@class='gb_d'])[2]")).isDisplayed())
		{
			System.out.println("google page is opend successfully.........");
		}else
		{
			System.out.println("Test case is failed..............");
		}

		Thread.sleep(2000);

		driver.findElement(By.linkText("Images")).click();

		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");

		Thread.sleep(2000);

		WebElement kriti_didi =   driver.findElement(By.xpath("(//ul[@role='listbox'])[1]"));

		List<WebElement> sweetie = kriti_didi.findElements(By.tagName("li"));
		System.out.println(sweetie.size());
		System.out.println("-------------------------------------------------------------------------------------------------------");

		System.out.println("Size is printed successully.................");

		for( WebElement cutie : sweetie)

		{

			String all_kriti_information = cutie.getText();
			System.out.println(all_kriti_information);
		}

		System.out.println("-----------------------------------------------------------------------------------------------------");

		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("images")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here..............."); 

		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");

		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("saree")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here...............");


		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");

		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("photo")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here...............");

		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");

		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("height")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here...............");

		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");


		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("pic")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here...............");

		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon");

		for(int i =0 ; i<=sweetie.size(); i++)

		{
			if( sweetie.get(i).getText().toLowerCase().contains("sister")) {

				sweetie.get(i).click();		
				break;
			}		 
		}
		System.out.println("Link has been successfylly clicked here...............");  


		Thread.sleep(2000);
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Kriti Senon"); 

		Thread.sleep(3000); 

		driver.findElement(By.xpath("(//*[@role='button'])[6]")).click();   

		System.out.println("--------------------------------------------------------------------------------------------------------");		 

		if(driver.findElement(By.xpath("(//*[@focusable='false'])[3]")).isSelected())

		{
			System.out.println("Button is selected test case is passed..........");
		}else
		{
			System.out.println("Button is not clicked ... test case is failed..........");
		}


		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/span/div/div[1]/div/div[1]/div[2]/div/div[4]/g-checkbox")).click(); 	

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[1]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[6]")).click();


		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[3]")).click();


		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[2]")).click();


		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[7]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//g-checkbox[@role='checkbox'])[5]")).click(); 

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@role='radio'])[7]")).click();   // Other option has clicked here

		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/span/div/div[2]/div/div/a")).click(); 
		System.out.println("Legal help link has clicked......");

		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click();   // Main menu button has clicked.........

		Thread.sleep(2000);
		driver.findElement(By.linkText("Help Center")).click();
		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("Privacy Policy")));
		act.click();
		act.build().perform();
		System.out.println("completed");
		System.out.println("---------------------------------------------------------------------------------------------------------------"); 

		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.linkText("Terms of Service")));
		act.click();
		act.build().perform();
		System.out.println("terms and service has clicked.............");
		System.out.println("-------------------------------------------------------------------------------------------------------------------");

		Thread.sleep(4000);
		WebElement langg =    driver.findElement(By.xpath("//div[@role='listbox']"));
		langg.click();

		System.out.println("All langauges has clicked successfully ....");
		System.out.println("-----------------------------------------------------------------------------------------------------------------");

		for(int i = 0; i<=0; i++) {
			String all_text = langg.getText();
			System.out.println(all_text);
		}

		System.out.println("All complete lang print here ......");
		System.out.println("--------------------------------------------------------------------------------------------------------------");

		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[@role='button'])[1]")).click(); 

		Thread.sleep(2000);
		driver.findElement(By.linkText("Submit feedback")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@class='material2-button']")).click();


		// driver.findElement(By.xpath("/html/body/div[2]/div/div/uf-describe-page/form/div[1]/textarea")).clear();

		//  driver.findElement(By.xpath("/html/body/div[2]/div/div/uf-describe-page/form/div[1]/textarea")).sendKeys("I love you Ankita. I will dye without you. Just because of you my heart is beating.");

		//WebElement check =  driver.findElement(By.xpath("//*[@d='M19 3H5c-1.11 0-2 .9-2 2v14c0 1.1.89 2 2 2h14c1.11 0 2-.9 2-2V5c0-1.1-.89-2-2-2zm-9 14l-5-5 1.41-1.41L10 14.17l7.59-7.59L19 8l-9 9z']"));

		// check.click();   

		//  driver.findElement(By.xpath("//button[@key='cancel']")).click();
		Thread.sleep(4000);

		driver.navigate().back();

		System.out.println("The task is over........");
		driver.quit();

	}

}
