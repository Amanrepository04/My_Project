package login;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Signup {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.navigate().to("https://www.amazon.ca/");
	Thread.sleep(200);
	File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile,new File("F://screenshot.jpfg"));
	boolean result= driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
	System.out.println(result);
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
	driver.findElement(By.xpath("//*[@id=\"nav-flyout-ya-newCust\"]/a")).click();
	
	SignupPOM abc=new SignupPOM(driver);
	abc.typeyname("Varun Salgotra");
	Thread.sleep(200);
	abc.typeemail("varun@gmail.com");
	Thread.sleep(200);
	abc.typepassword("Varun123");
	Thread.sleep(200);
	abc.typecpassword("Varun123");
	Thread.sleep(200);
	abc.button();
	Thread.sleep(500);
	driver.close();
	}
	
	
	
	
	


}
