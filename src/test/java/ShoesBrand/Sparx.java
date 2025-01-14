package ShoesBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sparx {
	
	@Test
	public  void flipcart() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.flipkart.com/search?q=sparx%20shoes&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
		
	}


}
