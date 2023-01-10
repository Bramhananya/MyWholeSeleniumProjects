package Pom_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Normal_HRM {

	
	WebDriver driver;
	
	public Normal_HRM(WebDriver driver) {
		
		this.driver= driver;
	}
	
	@FindBy(id="frmLogin")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement clickbutton;
	
   @FindBy(how = How.LINK_TEXT,using="Forgot your password?")
    WebElement linkclicked;
	
   public void loginapp(String username1, String password1) {
	   
	   username.sendKeys(username1);
	   password.sendKeys(password1);
	   clickbutton.click();
	 
	   linkclicked.click();
	   
      }
	
}
   
   

