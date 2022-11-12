package basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test10 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.actitime.com/");
		
		Point targetPostition = new Point(3, 3);
		driver.manage().window().setPosition(targetPostition);
		
		

	}

}
