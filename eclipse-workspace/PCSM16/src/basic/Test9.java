package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://licindia.in/");

		Dimension targetSize = new Dimension(300,200);
		driver.manage().window().setSize(targetSize);
		

	}

}
