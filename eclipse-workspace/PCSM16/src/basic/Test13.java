package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		
		int a = driver.findElements(By.tagName("a")).size();
		System.out.println(a);
	
	}	

}
