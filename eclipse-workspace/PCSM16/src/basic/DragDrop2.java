package basic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/droppable/");
		WebElement element = driver.findElement(By.id("draggable"));
		//WebElement dest = driver.findElement(By.xpath("//div[@class='column blocks']"));
		WebElement dest = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions actions = new Actions(driver);
		
		actions.clickAndHold(element).moveToElement(dest).release().build().perform();
	//	actions.perform();   draggable

	}

}
