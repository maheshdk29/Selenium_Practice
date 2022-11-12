package basic;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test73 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://flipkart.com/login");
		
		TakesScreenshot sc = (TakesScreenshot)driver;
		File tempfile = sc.getScreenshotAs(OutputType.FILE);
		
		File destfile = new File("./Errorshots/flifkar.png");
		tempfile.renameTo(destfile);
		
		FileUtils.copyFile(tempfile, destfile);
	
		
	}

}
