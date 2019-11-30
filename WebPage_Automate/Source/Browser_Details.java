package Source;

import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Browser_Details {
	
	public WebDriver driver;	
		
		@BeforeTest
		public void openBrowser() throws InterruptedException {
		File f= new File("Source");
		File fs= new File(f, "chromedriver.exe");

		System.setProperty("webdriver.chrome.driver", fs.getAbsolutePath());
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staging.nhancego.com/nhance/jarvis");
		
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "nhance";
		
		System.out.println(actualTitle);
		if(actualTitle.equalsIgnoreCase(expectedTitle))
			System.out.println("Title Matched");
		else
			System.out.println("Title didn't match");
		
		
		
		}

}
