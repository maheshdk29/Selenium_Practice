package basic;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.get("https://www.facebook.com/");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		

		//driver.navigate().back();
		//driver.navigate().refresh();
		

	}

}
