package Listners;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.crm.ListnerCode.DWSBaseClass;

@Listeners(com.crm.ListnerCode.DwsLogin.class)
public class AddToCart extends DWSBaseClass {
	@Test
	public void addToCart() {
		driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
		List<WebElement> products = driver.findElements(By.cssSelector("input[value='Add to cart']"));
		for (WebElement singleP : products) {
			singleP.click();	
		}
	}

}
