package ShoesBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Fifa {
	@Test
	public  void amazon() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.amazon.in/s?k=shoes+fifa&crid=LSFNVQEMGEBJ&sprefix=shoes+fifa%2Caps%2C410&ref=nb_sb_noss_2");
		
	}


}
