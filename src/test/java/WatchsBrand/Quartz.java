package WatchsBrand;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quartz {
	public  void meesho() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.meesho.com/search?q=quirtz%20watches&searchType=manual&searchIdentifier=text_search");
		
		

	}

}
