package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test53 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		String actualtext = driver.findElement(By.id("headerContainer")).getText();
		System.out.println(actualtext);
		
		String expectedtext = driver.getPageSource();
		
		if(expectedtext.contains(actualtext)) {
			System.out.println("Pass:Text is same");
		}else {
			System.out.println("Fail:Text is not same");
		}

	}

}
