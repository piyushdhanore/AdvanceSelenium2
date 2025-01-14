package WatchsBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sonata {
	@Test
	public  void amazon() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.amazon.in/s?k=sonata+watche&crid=1L5PKPEA41PCI&sprefix=sonata+watch%2Caps%2C348&ref=nb_sb_noss_1");
		
	}


}
