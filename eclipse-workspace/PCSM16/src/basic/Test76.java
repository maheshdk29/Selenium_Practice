package basic;

import java.time.Duration;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test76 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("00000000001523");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");//To scroll downwords
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(500,0)");//To scroll right side
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(0,-500)");//To scroll upwords
		Thread.sleep(4000);
		jse.executeScript("window.scrollBy(-500,0)");//To Scroll left side
		

	}

}
