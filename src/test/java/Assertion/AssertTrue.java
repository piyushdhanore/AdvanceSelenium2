package Assertion;


import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertTrue {
	@Test
	public void hardAssert() {
	String  Expected_url = "https://demowebshop.tricentis.com/";
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			
			driver.get("https://demowebshop.tricentis.com/");
			String actual_url = driver.getCurrentUrl();
		
			boolean result = Expected_url.equals(actual_url);
			assertTrue(result);
			
			driver.findElement(By.id("small-searchterms")).sendKeys("Watches");
			driver.findElement(By.cssSelector("input[value='Search']")).click();
	}


}
