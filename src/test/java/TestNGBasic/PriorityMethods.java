package TestNGBasic;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.Test;
	public class PriorityMethods {

		@Test(priority = 2)
		public void jio() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.jiocinema.com/");
			driver.close();
			
		}
		@Test(priority = 3)
		public void csk() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.chennaisuperkings.com//");
			driver.close();
			
		}
		@Test(priority = 1 ,enabled = false)
		public void rcb() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.royalchallengers.com/");
			driver.close();
			
		}
		@Test(priority = 0 ,invocationCount = 2,threadPoolSize = 2)
		//to run this we have to specify the environment either java or testNG
		public void mumbai() {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.mumbaiindians.com/");
			System.out.println("Big fan of Rohit Sharma...!!!!");
			driver.close();
			
			
		}

	}

