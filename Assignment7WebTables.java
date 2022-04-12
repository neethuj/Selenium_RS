package Package_B_R;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7WebTables {

	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver","/Users/jithus/Neethu/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		WebElement table = driver.findElement(By.id("product"));
		//System.out.println(driver.findElement(By.cssSelector("table[class='table-display']")).getSize());
		
		
		System.out.println("Row count is = " +table.findElements(By.tagName("tr")).size());
		System.out.println("Column count is = " +table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> values=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(values.get(0).getText());
		System.out.println(values.get(1).getText());
		System.out.println(values.get(2).getText());
		
		
		
		

	}

}
