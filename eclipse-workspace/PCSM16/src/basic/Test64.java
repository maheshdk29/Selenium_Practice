package basic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
//		Object destfile = File("./Errorshots/Actitime1.png");
		
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		//System.out.println(tempfile.getAbsolutePath());
		
		File destfile = new File("./Errorshots/Actitime1.png");
		tempfile.renameTo(destfile);
		
		

	}

	private static Object File(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
