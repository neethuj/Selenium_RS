package Package_B_R;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement2UI {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/jithus/Neethu/workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.easemytrip.com");
		driver.findElement(By.id("FromSector_show")).click();
		driver.findElement(By.xpath("//*[@id='fromautoFill']/div[2]/div/ul/li[2]")).click();
		
		driver.findElement(By.id("Editbox13_show")).click();
		driver.findElement(By.xpath("//*[@id ='toautoFill']/div/div/ul/li[9]")).click();
		
		driver.findElement(By.cssSelector("input[id='chkStudent']")).click();
		
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.cssSelector(".active-date")).click();
		
		driver.findElement(By.className("dropbtn_n9")).click();
		for(int i=1;i<=3;i++){
		driver.findElement(By.className("plus_box1")).click();
		}
		
		
		for(int i=1;i<=2;i++) {
		driver.findElement(By.className("plus_boxChd")).click();
		}
		driver.findElement(By.id("traveLer")).click();
		
		
		
		driver.findElement(By.xpath("//div[@class='search_bg']/div[1]/div[6]")).click();
		driver.findElement(By.xpath("//div[@id='myDropdown_n9']/div/label[3]")).click();
		driver.findElement(By.id("tripType")).click();
		
		
		driver.findElement(By.id("search")).click();
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("OopMsg")).getText());

		Thread.sleep(3000);
        driver.close();
	}

}
