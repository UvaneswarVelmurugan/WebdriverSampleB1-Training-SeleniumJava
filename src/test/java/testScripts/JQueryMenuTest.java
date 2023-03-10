package testScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JQueryMenuTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions actions=new Actions(driver);
		driver.manage().window().maximize();
		driver.get("http://the-internet.herokuapp.com/jqueryui/menu");
		WebElement Enabled=driver.findElement(By.xpath("//a[text()='Downloads']"));
		actions.moveToElement(Enabled).perform();
		
		WebElement Downloads=driver.findElement(By.xpath("//a[text(),'Downloads']"));
		wait.until(ExpectedConditions.elementToBeClickable(Downloads));
		WebElement Excel=driver.findElement(By.xpath("//a[text()='Excel']"));
		wait.until(ExpectedConditions.elementToBeClickable(Excel));
		actions.click(Excel).perform();
		

	}

}
