package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class L1{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("7026188417");
		driver.findElement(By.name("pass")).sendKeys("Mdk1234");
		driver.findElement(By.name("login")).click();
		
		//driver.findElement(By.className("icdlwmnq o9w3sbdw f92fqwvt cavyzvzu bbgqxxx1 j4vk3mq5 bdao358l alzwoclg nd5c72wq om3e55n1 mfclru0v c8dj4xom kgnml90y")).sendKeys(Keys.ENTER);
		
		
	}
}