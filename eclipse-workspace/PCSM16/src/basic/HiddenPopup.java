package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub        https://www.naukri.com/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies'] ")).sendKeys("Mahesh");

	}

}
