package week2.day2Assignmenets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundTable {

	public static void main(String[] args) {

	//	https://leafground.com/pages/table.html
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/pages/table.html");
		//Get the count of number of columns
		List <WebElement> column = driver.findElements(By.xpath("//th"));
		int count = column.size();
		System.out.println("Number of columns in the table: "+ count);
		//Get the count of number of rows
		List <WebElement> row = driver.findElements(By.xpath("//td"));
		int count1 = row.size();
		System.out.println("Number of rows in the table: "+ count1);
		//Get the progress value of 'Learn to interact with Elements
		String progress = driver.findElement(By.xpath("//tr[@class='even']/td[2]")).getText();
		System.out.println("The progress value of Learn to interact with Elements: "+ progress);
		//Check the vital task for the least completed progress
		driver.findElement(By.xpath("//tr[6]/td[3]")).click();
		
	}

}
