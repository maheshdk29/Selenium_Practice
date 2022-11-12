package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test41 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement element = driver.findElement(By.id("username"));
		System.out.println(element.isDisplayed());
		if(element.isDisplayed()) {
			System.out.println("true: element is displayed");
		}
		else {
			System.out.println("false: element is not displayed");
		}
	

	}

}
