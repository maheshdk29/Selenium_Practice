
package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://irctc.com/contact.html");
		driver.findElement(By.cssSelector("a[aria-controls='collapse-9']")).click();
		
		driver.findElement(By.xpath("//td[text()='Buddhist train']/..//td[@data-title='mail']"));

	}

}
