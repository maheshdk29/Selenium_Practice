package basic;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		
		driver.get("https://licindia.in/Top-Links/About-Us/Know-About-Your-Life-Insurance");
		
		Navigation nav = driver.navigate();
		
		nav.back();
		Thread.sleep(2000);
		nav.forward();
		Thread.sleep(2000);
		nav.refresh();
		

	}

}
