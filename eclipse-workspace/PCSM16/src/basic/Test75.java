package basic;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test75 {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt = LocalDateTime.now();
		String timestamp = ldt.toString().replace(":","-");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement ts = driver.findElement(By.id("loginButton"));
		//TakesScreenshot sc = (TakesScreenshot)driver;
		File tempfile = ts.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./Errorshots/flifkart"+timestamp+".jpg");
//		tempfile.renameTo(destfile);
		
		FileUtils.copyFile(tempfile, destfile);


	}

}
