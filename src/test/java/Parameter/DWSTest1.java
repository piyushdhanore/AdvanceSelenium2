package Parameter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DWSTest1 extends BasicDemowebShop {
//	WebDriver driver ;
	@Test
	public void test1() {
		
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement targeted_ele = driver.findElement(By.xpath("//h3[text()='Follow us']"));
	js.executeScript("arguments[0].ScrollIntoView(true)", targeted_ele);
	
     
     
	List<WebElement> products = driver.findElements(By.cssSelector("div[class='column follow-us']"));
	
	for (WebElement web : products) {
		web.click();
		
	}
	
	
		
		
	}

}
