package ShoesBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Red_Tape {
	@Test
	public  void myntra() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.myntra.com/red-tape-shoes?rawQuery=red%20tape%20shoes");
		
	}


}
