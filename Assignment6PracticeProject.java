package Package_B_R;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6PracticeProject {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jithus/Neethu/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		driver.findElement(By.id("checkBoxOption3")).click();
		String text = driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]")).getText();
		
		WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
		Select s= new Select(dropdown);
		s.selectByVisibleText(text);
		

		driver.findElement(By.id("name")).sendKeys(text);
		driver.findElement(By.id("alertbtn")).click();
		
		String text1 = driver.switchTo().alert().getText();
		
		if(text1.contains(text)) {
			System.out.println("Selected option present");
		}
		else {
			System.out.println("Selected option not present");
		}

	}

}
