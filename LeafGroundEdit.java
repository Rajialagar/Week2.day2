package week2.day2Assignmenets;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundEdit {

	public static void main(String[] args) {

		//http://leafground.com/pages/Edit.html

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Edit.html");

		//Enter email ID
		driver.findElement(By.id("email")).sendKeys("rajialagar@gmail.com");
		//Append a text and press keyboard tab
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("the given text as Rajalakshmi Alagarsmay",Keys.TAB);
		String str = driver.findElement(By.xpath("//input[@value='Append ']")).getAttribute("value");
		System.out.println(str);
		//Get default text entered
		String str1 = driver.findElement(By.xpath("//input[@name='username'][1]")).getAttribute("value");
		System.out.println(str1);
		//Clear the text
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		//Confirm that edit field is disabled
		boolean check = driver.findElement(By.xpath("//label[text()='Confirm that edit field is disabled']/following::input")).isEnabled();
		if (check == true) {
			System.out.println("The field is enabled");
		}
		else {
			System.out.println("This field is Disabled");
		}
		//Close the browser
	//	driver.close();


	}

}
