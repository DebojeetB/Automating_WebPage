package Source;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Communication_POM {

	public Communication_POM(WebDriver driver) {
 		
		 PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath="//*[@class='fas fa-chevron-down']")
	List <WebElement>Communication;

	@FindBy(xpath="*[@id=\"pageSubmenu\"]/li[1]/a")
	WebElement Notification;

	@FindBy(partialLinkText = "NOTIFICATION CENTRE")
	WebElement Notification_Centre;

	@FindBy(xpath="//*[@class='btn add_notification btn-primary']")
	WebElement sendNotification;
	
	@FindBy(name="title")
	WebElement Title;

		
	
	
}


	
//

