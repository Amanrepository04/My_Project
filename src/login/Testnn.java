package login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Testnn {

	WebDriver driver;
	
	@BeforeMethod
	public void openbrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver ","chromedriver.exe");
	driver= new ChromeDriver();	
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.ca/");
	Thread.sleep(200);
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	}
	
	@Test
	public void amazon() {
		SignupPOM abc=new SignupPOM(driver);
		abc.typeyname("Varun Salgotra");
		abc.typeemail("varun@gmail.com");
		abc.typecpassword("Varun123");
		abc.typecpassword("Varun123");
		abc.button();
	}
	@AfterMethod
	public void closebrowser() {
		driver.close();
	}
}
