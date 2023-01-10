package Pom_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;

public class Login_Orangre_HRM {
	
	WebDriver driver;
	
	     By username = By.id("txtUsername");
	     By password = By.id("txtPassword");
	     By loginbutton = By.id("btnLogin");
	      By linkt =  By.linkText("Forgot your password?");
	     	     
	     public Login_Orangre_HRM(WebDriver driver) {
	    	 
	    	 this.driver = driver;
	     }
	
     public void typeusername(String UID) {  
    	 
    	 driver.findElement(username).sendKeys(UID);
     }
     
     public void typepassword(String PASS) {
    	 
    	 driver.findElement(password).sendKeys(PASS);
     }
     
     public void clickloginbutton() {
    	 
    	 driver.findElement(loginbutton).click();
     }
     
     public void forgotten_pass() {
    	 
   	 driver.findElement(linkt).click();
     }
}
