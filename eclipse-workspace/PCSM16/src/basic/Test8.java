package basic;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://licindia.in/");
		Dimension dim = driver.manage().window().getSize();
		System.out.println("width = "+dim.getWidth());
		System.out.println("Height = "+dim.getHeight());

	}

}
