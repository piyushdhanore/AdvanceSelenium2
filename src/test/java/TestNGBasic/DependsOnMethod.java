package TestNGBasic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

//even if prorityis given but if ine method is dependen on snother method then independent method need to be execute
//then only dependent method will execute.

public class DependsOnMethod {
	@Test(priority = 3)
	public void createAccount() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.chennaisuperkings.com//");
		System.out.println("Account has been created..");
		driver.close();
		
	}
	@Test(priority = 0,dependsOnMethods ="createAccount" )
	public void modifyAccount()
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.royalchallengers.com/");
		System.out.println("Account has been modified");
		driver.close();
	}
	@Test(priority = 2)
	public void deleteAccount() {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.jiocinema.com/");
		driver.close();
	}

}
