package Action_Clas;

import org.openqa.selenium.By;

public class hhhh {

	public static void main(String[] args)throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");	
		org.openqa.selenium.WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://Snapdeal.com");

		Thread.sleep(2000);

		if(driver.findElement(By.className("accountUserName colxs12resetpadding")).isDisplayed())
		{
			System.out.println("Snepdeal app open  sucessfully....")	;
		}else {
			System.out.println("test case is failed........");
		}
		driver.quit();

	}

}



