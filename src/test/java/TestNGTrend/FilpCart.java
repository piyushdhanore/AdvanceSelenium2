package TestNGTrend;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FilpCart {
	@Parameters({"url"})

	@Test(groups = "smoke")
	public  void main(String url) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//		driver.get("https://www.flipkart.com/");
		driver.get(url);
		driver.close();

	}

}
