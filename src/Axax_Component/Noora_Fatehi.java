package Axax_Component;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Noora_Fatehi {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	driver.navigate().to("https://Google.com");

		Thread.sleep(3000);

		String title_of_the_page =  driver.getTitle();

		System.out.println("Title => " + title_of_the_page);

		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Images")).click();

		System.out.println("The link is successfully clicked here.................");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Noora Fatehi");
		
		//driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");

		Thread.sleep(3000);
		
		WebElement cutie_noora =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));


		List<WebElement> noora_didi =  cutie_noora.findElements(By.tagName("li"));

		System.out.println(noora_didi.size());

		System.out.println("------------------------------------------------------------------------------");

		for( WebElement sweetu_noora  : noora_didi) {	

			String all_noora =	sweetu_noora.getText();
			System.out.println(all_noora);
		}

		System.out.println("------------------------------------------------------------------------------");

		Thread.sleep(3000);

		for(int j = 0 ; j<noora_didi.size(); j++) {

			if(noora_didi.get(j).getText().toLowerCase().contains("pic")) {

				noora_didi.get(j).click();
				break;
			}
		}  
		
		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");
		WebElement cutie_noora2 =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));

		List<WebElement> noora_didi2 =  cutie_noora2.findElements(By.tagName("li"));


		for(int j = 0 ; j<noora_didi2.size(); j++) {

			if(noora_didi2.get(j).getText().toLowerCase().contains("saree")) {

				noora_didi2.get(j).click();
				break;
			}

		}  

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");
		WebElement cutie_noora3 =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));

		List<WebElement> noora_didi3 =  cutie_noora3.findElements(By.tagName("li"));


		for(int j = 0 ; j<noora_didi3.size(); j++) {

			if(noora_didi3.get(j).getText().toLowerCase().contains("dance")) {

				noora_didi3.get(j).click();
				break;
			}

		}    

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");
		WebElement cutie_noora4 =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));

		List<WebElement> noora_didi4 =  cutie_noora4.findElements(By.tagName("li"));


		for(int j = 0 ; j<noora_didi4.size(); j++) {

			if(noora_didi4.get(j).getText().toLowerCase().contains("back")) {

				noora_didi4.get(j).click();
				break;
			}

		}    

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");
		WebElement cutie_noora5 =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));

		List<WebElement> noora_didi5 =  cutie_noora5.findElements(By.tagName("li"));


		for(int j = 0 ; j<noora_didi5.size(); j++) {

			if(noora_didi5.get(j).getText().toLowerCase().contains("drawing")) {

				noora_didi5.get(j).click();
				break;
			}

		}    

		Thread.sleep(2000);
		driver.navigate().back();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Noora Fatehi");
		WebElement cutie_noora6 =  driver.findElement(By.xpath("(//*[@role='listbox'])[1]"));

		List<WebElement> noora_didi6 =  cutie_noora6.findElements(By.tagName("li"));

		for(int j = 0 ; j<noora_didi6.size(); j++) {

			if(noora_didi6.get(j).getText().toLowerCase().contains("religion")) {

				noora_didi6.get(j).click();
				break;
			}

		}    

		System.out.println("all the pics are loded successfully................");
		
		System.out.println(" All test cases are completed.........");

		Thread.sleep(4000);
		driver.quit();
	}
}
