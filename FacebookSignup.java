package week2.day2Assignmenets;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookSignup {

		public static void main(String[] args) {
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		// Step 3: Load the URL https://en-gb.facebook.com/
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step 6: Click on Create New Account button
		driver.findElement(By.linkText("Create New Account")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y _3-90 lfloat _ohe']//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Raji");

		//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input[@class='inputtext _58mg _5dba _2ph-']

		// Step 8: Enter the last name
		driver.findElement(By.xpath("//div[@class='mbm _1iy_ _a4y rfloat _ohf']//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Prakash");

		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[@class='mbm _a4y'][1]//input[@name='reg_email__']")).sendKeys("9578636345");

		// Step 10: Enterthe password
		driver.findElement(By.xpath("//div[@class='mbm _br- _a4y']//input[@type='password']")).sendKeys("Jagu1234");


		// Step 11: Handle all the three drop downs

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='day']"));
		Select select = new Select(dropdown);
		select.selectByValue("8");

		WebElement dropdown1 = driver.findElement(By.xpath("//select[@id='month']"));
		Select select1 = new Select(dropdown1);
		select1.selectByValue("8");

		WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='year']"));
		Select select2 = new Select(dropdown2);
		select2.selectByValue("1979");


		// Step 12: Select the radio button "Female" */
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();

	}

}
