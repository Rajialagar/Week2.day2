package week2.day2Assignmenets;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundCheckbox {

	public static void main(String[] args) {
		
		//		http://leafground.com/pages/checkbox.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/checkbox.html");
		
		//Select the languages that you know?
		driver.findElement(By.xpath("//div[@class='example']/input[1]")).click();
		driver.findElement(By.xpath("//div[@class='example']/input[3]")).click();
		
		//Confirm Selenium is checked
		boolean check = driver.findElement(By.xpath("//label[text()='Confirm Selenium is checked']/following::input")).isSelected();
		System.out.println(check);
		
		//DeSelect only checked
		driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).click();
		boolean check1 = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]")).isSelected();
		System.out.println(check1);
		
		//Select all below checkboxes
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[6]")).click();
		
		driver.close();
	}
	
}
