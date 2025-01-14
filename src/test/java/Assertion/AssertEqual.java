package Assertion;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Parameter.BasicDemowebShop;

public class AssertEqual  {
	@Test
	public void hardAssert() {
	String  Expected_url = "https://demowebshop.tricentis.com/";
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			driver.get("https://demowebshop.tricentis.com/");
			String actual_url = driver.getCurrentUrl();
		
			assertEquals(Expected_url, actual_url);
			driver.findElement(By.id("small-searchterms")).sendKeys("Watches");
			driver.findElement(By.cssSelector("input[value='Search']")).click();
	}

}
