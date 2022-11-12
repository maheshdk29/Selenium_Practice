package basic;
import java.io.File;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test72{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/login");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File tempfile = sc.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./Errorshots/program.jpg");
		tempfile.renameTo(destfile);
		
	}
}