package Dyanamic_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practse_form {

	public static void main(String[]args) {
		
		

	    // Main Method is the execution point of any Java Program
	   
	        // Initialize Webdriver Object
	        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        // Open URL
	        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
	        // Set Chrome window size
	      
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        // Enter Firstname
	        driver.findElement(By.name("firstname")).click();
	        driver.findElement(By.name("firstname")).sendKeys("Ankita");
	        // Set Lastname
	        driver.findElement(By.name("lastname")).click();
	        driver.findElement(By.name("lastname")).sendKeys("Bramha");
	        // Select Gender
	        driver.findElement(By.id("sex-0")).click();
	        // Select Experience
	        driver.findElement(By.id("exp-4")).click();
	        // Enter Date
	        driver.findElement(By.id("datepicker")).click();
	        driver.findElement(By.id("datepicker")).sendKeys("16-10-2020");
	        // Select Profession
	        driver.findElement(By.id("profession-1")).click();
	        // Select Automation Tool
	        driver.findElement(By.id("tool-2")).click();

	        // Select Continent
	        driver.findElement(By.id("continents")).click();
	        WebElement dropdown = driver.findElement(By.id("continents"));
	        dropdown.findElement(By.xpath("//option[. = 'Europe']")).click();

	        // Select Command
	        WebElement dropdown2 = driver.findElement(By.id("selenium_commands"));
	        dropdown.findElement(By.xpath("//option[. = 'Browser Commands']")).click();

	        // Scroll Vertical
	        js.executeScript("window.scrollTo(0,675.5555419921875)");

	        // Click Submit
	        driver.findElement(By.id("submit")).click();
	        
	        System.out.println("The form has beeen successfully filled here...");
	        
	        driver.quit();
	  }

	
}
