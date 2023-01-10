package Pom_Classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_Design_Home_Page {
	
	/*this framework are the java design patern that will makes code maintaintnance easy and we can say that 
	efficient.This poma are used for desiging web pages. hesre we are desiging the webpages mens we are going to be 
	considerd as the whole webpage is a class and all the weblements that is to be present on that purticular webages are variables.*/
	
	WebDriver driver;
	
	By fb_username = By.xpath("//*[@type='text']");
    By fb_password	= By.name("pass");
    By fb_login =   By.name("login");
    By click_create =  By.linkText("Create New Account");
    
    public  Facebook_Design_Home_Page(WebDriver driver) {
    	
    	this. driver = driver;
    }

    public void fb_fill_usernme(String UID) {
    	
    	driver.findElement(fb_username).sendKeys(UID);
    	System.out.println("Values are putted here successfully....");
    }
    public void fb_fill_password(String PASS) {
    	
    	driver.findElement(fb_password).sendKeys(PASS);
    }
    public void fb_clicl_login_button() {
    	
    	driver.findElement(fb_login).click();
    }
    
    public void cliclk_create_button() {
    	
    	driver.findElement(click_create).click();
    	System.out.println("Link has successfully clicked here .......");
    }
}
