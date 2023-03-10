package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrecedingAndFollowingPrintTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("https://www.lambdatest.com/blog/");
		List<WebElement> before = driver.findElements(By.xpath("//li[@id='menu-item-31219']//preceding-sibling::li"));
		for(WebElement item : before) {
			System.out.println("Categories before Playwright Testing : "+item.getText());
		}
		List<WebElement> after = driver.findElements(By.xpath("//li[@id='menu-item-31219']//following-sibling::li"));
		for(WebElement item : after) {
			System.out.println("Categories after Playwright Testing : "+item.getText());
		}

	}

}
