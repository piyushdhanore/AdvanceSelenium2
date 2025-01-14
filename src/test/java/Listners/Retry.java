package Listners;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;




public class Retry {
	@Test(retryAnalyzer = com.crm.ListnerCode.ListnerRetry.class)
	public void retryMethod() {
		
	    WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.id("small-searchterms")).sendKeys("Watches");
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		
	}

}
