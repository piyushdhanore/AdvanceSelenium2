package Basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Type something']")).sendKeys("CivilRocks");
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Dipti@04");
		driver.findElement(By.cssSelector("input[placeholder='Re-Type Password']")).sendKeys("Dipti@04");
		driver.findElement(By.cssSelector("input[placeholder='Enter a valid e-mail']")).sendKeys("diptichougule4@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='URL']")).sendKeys("https://demoapps.qspiders.com/");
		driver.findElement(By.cssSelector("input[placeholder='Enter only digits']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("input[placeholder='Enter only numbers']")).sendKeys("7276706971");
		driver.findElement(By.cssSelector("input[placeholder='Enter alphanumeric value']")).sendKeys("Dipti@04");
		
		driver.findElement(By.cssSelector("input[placeholder='Min 6 chars.']")).sendKeys("DiptiiChougule");
		driver.findElement(By.cssSelector("input[placeholder='Max 6 chars.']")).sendKeys("Diptii");
		driver.findElement(By.cssSelector("input[placeholder='Text between 5 - 10 chars length']")).sendKeys("Diptii");
		driver.findElement(By.cssSelector("input[placeholder='Min value is 6']")).sendKeys("1");
		driver.findElement(By.cssSelector("input[placeholder='Max value is 6']")).sendKeys("9");
		driver.findElement(By.cssSelector("input[placeholder='Number between 6 - 100']")).sendKeys("45");
		
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		
		
		

	}

}
