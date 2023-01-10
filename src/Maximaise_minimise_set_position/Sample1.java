package Maximaise_minimise_set_position;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main (String[]args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://Amezon.com");
		Point pnt = new Point(200, 200);
		driver.manage().window().setPosition(pnt);

		Thread.sleep(1000);

		Point pnt2 = new Point(200, 300);
		driver.manage().window().setPosition(pnt2);

		Thread.sleep(1000);

		Point pnt3 = new Point(300, 400);
		driver.manage().window().setPosition(pnt3);

		Thread.sleep(1000);

		Point pnt4 = new Point(400, 200);
		driver.manage().window().setPosition(pnt4);

		Thread.sleep(1000);

		Point pnt5 = new Point(500, 300);
		driver.manage().window().setPosition(pnt5);

		Thread.sleep(1000);

		Point pnt6 = new Point(400, 100);
		driver.manage().window().setPosition(pnt6);

		Thread.sleep(1000);

		Point pnt7 = new Point(600, 200);
		driver.manage().window().setPosition(pnt7);


		Point pnt8= new Point(200, 300);
		driver.manage().window().setPosition(pnt8);

		Thread.sleep(1000);

		Point pnt9 = new Point(300, 400);
		driver.manage().window().setPosition(pnt9);

		Thread.sleep(1000);

		Point pntt = new Point(400, 200);
		driver.manage().window().setPosition(pntt);

		Thread.sleep(1000);

		Point pntttt = new Point(500, 300);
		driver.manage().window().setPosition(pntttt);

		Thread.sleep(1000);

		Point pnt0 = new Point(400, 100);
		driver.manage().window().setPosition(pnt0);

		Thread.sleep(1000);

		Point pnto = new Point(600, 200);
		driver.manage().window().setPosition(pnto);

		Thread.sleep(3000);

		Point pnty = new Point(100, 800);
		driver.manage().window().setPosition(pnty);

		System.out.println("Test case is completed .......................");
		System.out.println("Positiom must be set accurately...");

		driver.quit();

	}

}





















