package basic;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.manage().window().fullscreen();
		driver.get("https://licindia.in/");

	}

}
