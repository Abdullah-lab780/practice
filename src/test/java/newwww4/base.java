package newwww4;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class base {

	public WebDriver driver;

	public WebElement to;

	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\Drivers\\driv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
	}

	public void ProgressBar(By web1, String a ) {
		
		
		WebElement box = driver.findElement(web1);
		WebDriverWait wait = new WebDriverWait(driver, 3);
		//wait.until(ExpectedConditions.presenceOfElementLocated(()));
		wait.until(ExpectedConditions.presenceOfElementLocated(web1));
		box.clear();
		box.sendKeys(a);
		
		
		

	}
}
