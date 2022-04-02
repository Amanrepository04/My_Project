package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testn {
WebDriver driver;
	@BeforeClass
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe")	;	
	
	driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.ca/");
	Thread.sleep(200);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	}
	@Test(priority=1)
	public void typeyname() throws InterruptedException {
		driver.findElement(By.id("ap_customer_name")).sendKeys("Amanpreet Kaur");
		Thread.sleep(200);
		}
	@Test(priority=2)
	public void email() throws InterruptedException {
		driver.findElement(By.id("ap_email")).sendKeys("amanpreet04@gmail.com");
		Thread.sleep(200);
}
	@Test(priority=3)
	public void password() throws InterruptedException {
		driver.findElement(By.id("ap_password")).sendKeys("Amanpreet01");
		Thread.sleep(200);
}
	@Test(priority=4)
	public void cpassword() throws InterruptedException {
		driver.findElement(By.id("ap_password_check")).sendKeys("Amanpreet01");
		Thread.sleep(200);
	}
		@Test(priority=5)
		public void button() throws InterruptedException {
			driver.findElement(By.id("continue")).click();
			Thread.sleep(200);
}
		@AfterTest
		public void close() {
			driver.close();
		}
	}