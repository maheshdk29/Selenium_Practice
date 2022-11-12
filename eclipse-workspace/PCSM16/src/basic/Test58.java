package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test58 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		String expectedtitle = "Facebook – log in or sign up";
		Thread.sleep(2000);
		wait.until(ExpectedConditions.titleContains(expectedtitle));
//		Thread.sleep(2000);
		String actualtitle = driver.getTitle();
		wait.until(ExpectedConditions.titleContains(actualtitle));
		System.out.println(actualtitle);
		
		if(actualtitle.contains(expectedtitle)) {
			System.out.println("Pass: Title is same");
		}else {
			System.out.println("Fail: Title is not same");
		} 

	}

}
