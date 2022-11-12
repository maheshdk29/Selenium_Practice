package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubm    https://live.skillrary.com/testing-app/product.php?product=selenium-training
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://live.skillrary.com/testing-app/product.php?product=selenium-training");
		WebElement element = driver.findElement(By.id("add"));
		Actions actions = new Actions(driver);
		actions.doubleClick(element);
		actions.perform();

	}

}
