package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPOM {
WebDriver driver;
	@FindBy(id="ap_customer_name") WebElement Yname;
	@FindBy(id="ap_email") WebElement Email;
	@FindBy(id="ap_password") WebElement Password;
	@FindBy(id="ap_password_check") WebElement CPassword;
	@FindBy(id="continue") WebElement Continue;
	
public SignupPOM(WebDriver driver) {     
	PageFactory.initElements(driver, this);
}
public void typeyname (String name) {
	Yname.sendKeys(name);
}
public void typeemail(String email) {
	Email.sendKeys(email);
}
public void typepassword(String password) {
	Password.sendKeys(password);
}
public void typecpassword(String cpassword) {
	CPassword.sendKeys(cpassword);
}
public void button() {
	Continue.click();
}
}
