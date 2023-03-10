package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IFrameTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		String strLbl = driver.findElement(By.cssSelector("label span")).getText();
		System.out.println("Label in Main page : "+strLbl);
		//MainPage to Frame1
		driver.switchTo().frame("frame1");
		driver.findElement(By.xpath("//input")).sendKeys("Hello");
		
		//Frame1 to Frame3
		driver.switchTo().frame("frame3");
		driver.findElement(By.id("a")).click();
		
		//Frame3 to Frame1
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//input")).clear();
		driver.findElement(By.xpath("//input")).sendKeys("Hello Welcome");
		
		//Frame3 to MainPage
		driver.switchTo().defaultContent();
		
		//MainPage to Frame2
		driver.switchTo().frame("frame2");
		Select singleSel = new Select(driver.findElement(By.id("Animals")));
		singleSel.selectByValue("babycat");
		System.out.println(singleSel.getFirstSelectedOption().getText());
		

	}

}
