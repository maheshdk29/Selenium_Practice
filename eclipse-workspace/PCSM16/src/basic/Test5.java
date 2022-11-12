package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://licindia.in/");
		URL url = new URL("https://licindia.in/Products/Insurance-Plan");
		driver.navigate().to(url);
		
	}

}
