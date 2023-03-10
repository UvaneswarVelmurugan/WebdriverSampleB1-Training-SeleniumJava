package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllWindowPopupTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/window-popup-modal-demo.html");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent Win Handle : "+parentWin);
		driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-lg']")).click();
	    Set<String> tabs = driver.getWindowHandles();
	    System.out.println("Number of Windows : "+tabs.size());

	}

}
