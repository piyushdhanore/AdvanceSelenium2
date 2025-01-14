package TestNGFashion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {
	@Parameters({"url"})
	@Test(groups = "system")
	public  void main(String url) {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.get("https://www.facebook.com/");
	driver.get(url);
	driver.close();
}
}
