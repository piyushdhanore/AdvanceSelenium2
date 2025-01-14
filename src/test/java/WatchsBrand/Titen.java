package WatchsBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Titen {
	@Test
	public  void Ajio() {
			
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.navigate().to("https://www.ajio.com/search/?text=titen%20watch");
		}
			

	}



