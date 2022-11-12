package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test01 {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://wikimass.com/");
		
		String actual = driver.getPageSource();
		
		//System.out.println(element);
		String exptected = "Learn JavaScript";
		
		if(actual.contains(exptected)) {
			System.out.println("its there");
		}
		else
		{
			System.out.println("its not there");
		}
		
	}

}
