package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestsBase {
	
	
	
	 protected WebDriver driver;
	 
	 static String Url="http://automationpractice.com/index.php";
	
	
	@BeforeClass
	public void startBrowser(){
		
		System.setProperty("webdriver.gecko.driver", "src/resources/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(Url);
	
	}
	
	@AfterClass
	public void closeBrowser(){
		
		driver.quit();
		
		
	}

}
