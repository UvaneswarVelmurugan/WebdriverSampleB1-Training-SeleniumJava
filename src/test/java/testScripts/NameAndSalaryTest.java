package testScripts;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameAndSalaryTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Zuci Systems\\Web Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //Polymorphism , dynamic overloading
		driver.manage().window().maximize();
		driver.get("https://demo.seleniumeasy.com/table-sort-search-demo.html");
		List<WebElement> names = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//preceding-sibling::td[2]"));
// 	   List<WebElement> salary = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//following-sibling::td[3]"));
//		for(WebElement item : names) {
//		String strSalary = driver.findElement(By.xpath("//td[contains(text(),'San Francisco')]//following-sibling::td[3]")).getText();
//		for(WebElement items : salary)
//			{
//			System.out.println("Name and Salary Of the Workers in San Fransico is : "+item.getText());
//			System.out.println("Salary of " +item.getText() +items.getText());
//			break;
//			}
			
//		}
		System.out.println("The Names of the Workers in San Fransisco are : ");
	   for(WebElement item : names) {
			System.out.println(""+item.getText());
		}
	   List<WebElement> salary = driver.findElements(By.xpath("//td[contains(text(),'San Francisco')]//following-sibling::td[3]"));
	   System.out.println("The Salary of the Workers in San Fransisco respectively are : ");
	   for(WebElement item : salary) {
			System.out.println(""+item.getText());
		}


	}

}
