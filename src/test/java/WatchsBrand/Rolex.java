package WatchsBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rolex {	
		@Test
		public  void flipcart() {
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.navigate().to("https://www.flipkart.com/search?q=rolex%20watches&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
			
		}	
}
