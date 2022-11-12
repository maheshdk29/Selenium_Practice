package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggetion {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//li[@role='presentation']"));
		
		for(WebElement ele:elements) {
			String alllinks = ele.getText();
			//lSystem.out.println(alllinks);
			//(!alllinks.isEmpty())It will show if link is not empty
			//(alllinks.isEmpty()) It will show if link is empty
			
			if(!alllinks.isEmpty()) {
				System.out.println(alllinks);
			}
			
		}
	}

}
