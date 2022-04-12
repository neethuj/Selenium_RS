package Package_B_R;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdateDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","/Users/jithus/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		

	}

}
