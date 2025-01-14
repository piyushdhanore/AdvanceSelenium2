package  DataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ReadDataFromPropertyFile {
	@Test
	public void readData() throws IOException {
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("./ConfigFile/DWSFile.properties");
		prop.load(fis);
		String url =  prop.getProperty("url");
		String un = prop.getProperty("username");
		String pass = prop.getProperty("password");
//		System.out.println(url);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.id("Email")).sendKeys(un);
		driver.findElement(By.id("Password")).sendKeys(pass);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}


