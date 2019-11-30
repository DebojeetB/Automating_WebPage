package Source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {

	public LoginPage(WebDriver driver) {
 		
		 PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(id="username")
	WebElement UserName;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(xpath="//*[@class='btn login-btn btn-primary']")
	WebElement loginButton;
	
}
	

