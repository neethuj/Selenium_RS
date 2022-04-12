package Package_B_R;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment8AutocompleteDropdown {
public static void main(String[] args) throws InterruptedException {
		
	// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "/Users/jithus/Downloads/chromedriver");
	WebDriver driver = new ChromeDriver();
	driver.get("http://qaclickacademy.com/practice.php");
	driver.findElement(By.id("autocomplete")).sendKeys("can");
	Thread.sleep(3000);
	
	List<WebElement>options = driver.findElements(By.xpath("/html/body/ul/li"));
	
	for(WebElement option:options) {
		if(option.getText().equalsIgnoreCase("canada")) {
			option.click();
		}
		
	}
		
		

}
}
