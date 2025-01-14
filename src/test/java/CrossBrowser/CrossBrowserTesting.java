package CrossBrowser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	public WebDriver driver;
	@Parameters("browser")
	@Test
	public void crossBrowser(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) 
		{
			 driver= new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			driver= new EdgeDriver();
			
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver= new FirefoxDriver();
			
		} 
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		
		
	}

}
