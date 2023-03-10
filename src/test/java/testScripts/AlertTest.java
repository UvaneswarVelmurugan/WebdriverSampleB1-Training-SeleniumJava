package testScripts;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demo.seleniumeasy.com/javascript-alert-box-demo.html");
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		waits.until(ExpectedConditions.elementToBeClickable(btn));
		btn.click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert = driver.switchTo().alert();
		System.out.println("Simple Alert Msg : "+alert.getText());
		alert.accept();
		
	    driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'])[1]")).click();
		Alert confirm = driver.switchTo().alert();
		System.out.println("Simple Confirm Msg : "+alert.getText());
		confirm.dismiss();
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg'])[2]")).click();
		Alert Entcom = driver.switchTo().alert();
		Entcom.sendKeys("Velmurugan");
		Entcom.accept();
	}

}
