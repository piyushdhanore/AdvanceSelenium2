package Assertion;

import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertNotNull {
	@Test
	public void hardAssert() {
	String  Expected_url = "https://demowebshop.tricentis.com/";
		    WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
			String a="wateches";
			String b=null;
			driver.get("https://demowebshop.tricentis.com/");
			String actual_url = driver.getCurrentUrl();
		
			assertNotNull(a,b);
			
			driver.findElement(By.id("small-searchterms")).sendKeys("Watches");
			driver.findElement(By.cssSelector("input[value='Search']")).click();
	}



}
