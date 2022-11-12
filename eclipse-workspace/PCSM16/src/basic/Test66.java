package basic;
import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test66 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		TakesScreenshot ts = (TakesScreenshot)driver; //Down Casting
//		ts.getScreenshotAs(OutputType.FILE);
		
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./Errorshots/IRCTC.png");
		tempfile.renameTo(destfile);
		
		
		
	}

}
