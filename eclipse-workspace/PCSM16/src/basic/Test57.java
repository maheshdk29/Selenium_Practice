package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test57 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		String expectedurl = "https://demo.actitime.com/login.do";
		Thread.sleep(2000);
		wait.until(ExpectedConditions.titleContains(expectedurl));
		Thread.sleep(2000);
		String actualurl = driver.getCurrentUrl();
		wait.until(ExpectedConditions.titleContains(actualurl));
		System.out.println(actualurl);
		
		if(actualurl.contains(expectedurl)) {
			System.out.println("Pass: Url is same");
		}else {
			System.out.println("Fail: Url is not same");
		}
	}

}
