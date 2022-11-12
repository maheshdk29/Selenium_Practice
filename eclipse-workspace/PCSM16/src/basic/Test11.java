package basic;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test11 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.actitime.com/");
		
		Point element = driver.manage().window().getPosition();
		
		System.out.println("the x: "+element.getX());
		System.out.println("the y: "+element.getY());
		
		
		
	}

}
