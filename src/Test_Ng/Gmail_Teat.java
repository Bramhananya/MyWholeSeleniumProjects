package Test_Ng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gmail_Teat {
	
	public class GMailTest {
	
		
		@Test
		public void sendMail()
		{
			System.out.println("Send Mail Test");
		}
		
		@Test
		public void receiveMail()
		{
			System.out.println("Receive Mail Test");
		}
		
		@BeforeMethod
		public void login()
		{
			System.out.println("GMail Login");
		}
		
		@AfterMethod
		public void logout()
		{
			System.out.println("GMail Logout");
		}
		
		
		@BeforeClass
		public void launchGMail()
		{
			System.out.println("Launch GMail App");
		}
		
		@AfterClass
		public void closeGMail()
		{
			System.out.println("Close GMail App");
		}
		
		@BeforeTest
		public void deleteCoockies()
		{
			System.out.println("Delete Coockies");
		}
		
		@AfterTest
		public void closeAllBrowser()
		{
			System.out.println("Close All Browsers");
		}
		
		@BeforeSuite
		public void invokeWebDriver()
		{
			System.out.println("Invoke WebDriver");
		
		}
		
		@AfterSuite
		public void killWebDriver()
		{
			System.out.println("Kill WebDriver Object");
		}
		
	}
	
}

