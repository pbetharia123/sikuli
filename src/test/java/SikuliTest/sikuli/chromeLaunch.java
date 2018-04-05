package SikuliTest.sikuli;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.URL;


public class chromeLaunch {
public static WebDriver driver; 
@Test
	public static void b() throws MalformedURLException, InterruptedException{
		// TODO Auto-generated method stub
	//Thread.sleep(15000);	
		String URL = "http://www.facebook.com";
		//String Node = "http://192.168.0.102:5555/wd/hub";
		//new DesiredCapabilities();
		//new ChromeOptions();
		//DesiredCapabilities cap = DesiredCapabilities.chrome();
		ChromeOptions option = new ChromeOptions();
		System.setProperty("webdriver.chrome.driver", "D://CucumberProject//new//chromedriver_win32//chromedriver.exe");
		//driver = new RemoteWebDriver(new URL(Node),option);
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		Thread.sleep(5000);
		
		driver.quit();
		
			}

}
