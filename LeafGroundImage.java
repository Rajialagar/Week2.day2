package week2.day2Assignmenets;

import java.net.URL;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundImage {

	public static void main(String[] args) {


		//http://leafground.com/pages/Image.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Image.html");

		//Click on this image to go home page
		driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']/img")).click();
		driver.findElement(By.linkText("Image")).click();

		//Check the image is broken
		String check = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']")).getAttribute("naturalHeight");
		if (check.equals("0")) {
			System.out.println("The given image is broken");
		}
		else{
			System.out.println("The given image is NOT broken");
		}
	
		//Click by using Keyboard or Mouse
		driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		//driver.findElement(By.linkText("Image")).click();
	}

}


