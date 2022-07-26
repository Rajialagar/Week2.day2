package week2.day2Assignmenets;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundDropDown {

	public static void main(String[] args) {

		//http://www.leafground.com/pages/Dropdown.html
			
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Select dropdown list by using selectByIndex
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		Select select = new Select(dropdown1);
		select.selectByIndex(1);
		
		//Select dropdown list by using selectByVisibileText
		WebElement dropdown2 = driver.findElement(By.name("dropdown2"));
		Select select1 = new Select(dropdown2);
		select1.selectByVisibleText("Selenium");
	
		//Select dropdown list by using selectByValue
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		Select select2 = new Select(dropdown3);
		select2.selectByValue("1");
	
		// getting the list of options in the dropdown with getOptions()
		WebElement dropdown4 = driver.findElement(By.className("dropdown"));
		Select s = new Select(dropdown4);
		List <WebElement> op = s.getOptions();
		System.out.println("Number of options in the dropdown: " + op.size());
	
		//Select options by using sendkeys
		driver.findElement(By.xpath("//div[@class='example'][5]/select")).sendKeys("UFT/QTP");
		
		//Select multiple options from dropdown
		WebElement multiple = driver.findElement(By.xpath("//div[@class='example'][6]/select"));
		Select ss = new Select(multiple);
		ss.selectByIndex(1);
		ss.selectByValue("2");
		ss.selectByVisibleText("UFT/QTP");
		
		driver.close();
	}

}
