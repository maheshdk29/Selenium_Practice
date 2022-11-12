package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement usertext = driver.findElement(By.id("username"));
		usertext.sendKeys("admin");
		Thread.sleep(2000);
		usertext.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(2000);
		usertext.sendKeys(Keys.CONTROL+"c");
		Thread.sleep(2000);
		driver.findElement(By.name("pwd")).sendKeys(Keys.CONTROL+"v");
		
		
	}

}
