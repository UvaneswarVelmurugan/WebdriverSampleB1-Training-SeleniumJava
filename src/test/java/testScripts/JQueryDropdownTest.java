package testScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class JQueryDropdownTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/jquery-dropdown-search-demo.html");
		driver.findElement(By.xpath("//button[@class='secondary-button small-link']")).click();
		driver.findElement(By.xpath("//a[@class='small-link']")).click();
		Select singleSel = new Select(driver.findElement(By.id("country")));
		singleSel.selectByValue("Australia");
		
		Select mulSel = new Select(driver.findElement(By.xpath("//select[@class='js-example-basic-multiple select2-hidden-accessible']")));
		if(mulSel.isMultiple()) {
			mulSel.selectByIndex(1);
			mulSel.selectByVisibleText("Alabama");
			mulSel.selectByValue("Alaska");
			List<WebElement> items = mulSel.getAllSelectedOptions();
			System.out.println("Number of Selected Options : "+items.size());
		}

	}

}
