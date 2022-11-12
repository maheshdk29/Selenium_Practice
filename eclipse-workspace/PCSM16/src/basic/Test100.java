package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement sourceE1 = driver.findElement(By.id("column-1"));
		WebElement destE2 = driver.findElement(By.xpath("//div[@class='column blocks']"));
		//element = driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(sourceE1, destE2) ;
		
		actions.perform();

	}

}
