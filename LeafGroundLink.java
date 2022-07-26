package week2.day2Assignmenets;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundLink {

	public static void main(String[] args) {
		
		//http://leafground.com/pages/Link.html
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/Link.html");
		//Go to HomePage
		driver.findElement(By.linkText("Go to Home Page")).click();
		driver.findElement(By.linkText("HyperLink")).click();
		//Where the link supposed to go without clicking
		String url = driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");
		System.out.println(url);
		//Check if the link is broken
		driver.findElement(By.linkText("Verify am I broken?")).click();
		String str = driver.getTitle();
		if (str.contains("404")) {
			System.out.println("The given link is broken");
			
		} else{
			System.out.println("The given link is NOT broken");
		}
			
		driver.get("http://leafground.com/pages/Link.html");
		
		//Go to Home Page (Interact with same link name)
		String s = driver.findElement(By.xpath("//div[@class='large-6 small-12 columns']//following::a[4]")).getAttribute("href");
		System.out.println(s);
		driver.get(s);
		driver.findElement(By.linkText("HyperLink")).click();
		
		//Finding number of links available in the page
		List <WebElement> links = driver.findElements(By.xpath("//a"));
		int count = links.size();
		System.out.println("The number of links available in the page :" + count);
	}

}
