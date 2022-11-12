package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test38 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stu
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html");
		
		driver.findElement(By.linkText("jdk-11.0.16_linux-aarch64_bin.deb")).click();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.linkText("Download jdk-11.0.16_linux-aarch64_bin.deb"));
		
		if(element.isEnabled()) {
			System.out.println("Fail:Element is not enable ");
		}
		else {
			System.out.println("Pass:Element is enable ");
		}
	}

}
