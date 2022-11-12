package basic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			
			driver.get("https://flipkart.com/login");
			
			TakesScreenshot ts = (TakesScreenshot)driver; //Down Casting
			File tempfile = ts.getScreenshotAs(OutputType.FILE);
			
			File destfile = new File("./Errorshots/Flipkart.raw");
			tempfile.renameTo(destfile);

	}

	
}
