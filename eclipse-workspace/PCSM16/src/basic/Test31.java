package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualtext = driver.findElement(By.id("headerContainer")).getText();
		System.out.println(actualtext);
		
		String expectedtext = driver.getPageSource();
		
		if(expectedtext.contains(actualtext)) {
			System.out.println("Pass:Text is same");
		}else {
			System.out.println("Fail:Text is not same");
		}
		
	

	}

}
