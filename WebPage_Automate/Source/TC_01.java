package Source;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_01 extends Browser_Details{
	
	
	
	@Test
	public void Enter_Creds() throws IOException, InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		LoginPage login= new LoginPage(driver);
		Communication_POM comm= new Communication_POM(driver);
		
		Properties prop= new Properties();
			
		FileInputStream fip= new FileInputStream(System.getProperty("user.dir")+ ("\\Source\\config.properties"));
		prop.load(fip);
		
		login.UserName.sendKeys(prop.getProperty("userName"));
		login.Password.sendKeys(prop.getProperty("passWord"));
		login.loginButton.click();
		Thread.sleep(5000);

//		Clicking on Communication
		
		comm.Communication.get(0).click();
		comm.Notification_Centre.click();
		
		Thread.sleep(2000);
		
//		Click on Send Notification
		comm.sendNotification.click();
		Thread.sleep(2000);
		
//		Enter Details
		comm.Title.sendKeys("Debojeet");
		
		driver.findElement(By.name("date")).click();
		driver.findElement(By.className("next")).click();
		
//		Using absolute xpath below
		driver.findElement(By.xpath("//*[@id=\"date\"]/div/span[1]/div/div[2]/div/span[17]")).click();
		
		driver.findElement(By.xpath("//*[@name='posted_time']")).sendKeys("1010");
		driver.findElement(By.name("body")).sendKeys("Webpage Automation");
		driver.findElement(By.xpath("//*[@id=\"send_notification\"]/div[2]/label")).click();
		
		
//		((JavascriptExecutor)driver).executeScript("scroll(0,1000)");
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("scroll(0, 2000);");
		
		
		
		
		WebElement phoneNumber= driver.findElement(By.name("Mobile Number"));
		Actions action = new Actions(driver);
		action.moveToElement(phoneNumber);
		action.perform();
		driver.findElement(By.xpath("//*[@class='multiselect__select']")).click();
		Thread.sleep(2000);
		phoneNumber.sendKeys("7021830701");
		Thread.sleep(3000);
		action.sendKeys(Keys.ENTER).perform();
		
		Thread.sleep(3000);

//		Click on Create Button
		WebElement createButton= driver.findElement(By.xpath("//*[@class='btn create-btn btn-primary']"));
		action.moveToElement(createButton);
		
		createButton.click();
		createButton.click();		
		
		
	
	
	}
	
	
	


	
	
	

}
