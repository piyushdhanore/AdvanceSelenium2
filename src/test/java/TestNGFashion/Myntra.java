package TestNGFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Myntra {
	@Parameters({"url"})
	
	@Test(groups = "smoke")
	public  void main(String url) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.get("https://www.myntra.com/");
	driver.get(url);
	driver.close();
	


	
	


}

}
