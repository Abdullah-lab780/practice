package newwww2;

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
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
	}

	public void ProgressBar(By web1,By web2, String a ) {
		
		ArrayList<String> tabsGUId;
		WebElement clickButton = driver.findElement(web1);
		WebDriverWait wait = new WebDriverWait(driver, 1);
		wait.until(ExpectedConditions.elementToBeClickable((web1)));
		clickButton.click();
		tabsGUId = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabsGUId.get(1));
		
		driver.switchTo().window(tabsGUId.get(1));
		
		//System.out.println(driver.getTitle());
		
		System.out.println(tabsGUId.size());
		//wait.until(ExpectedConditions.visibilityOfElementLocated((web2)));
		//WebElement Text = driver.findElement(web2);
		//String b = Text.getText();
		String x = driver.findElement(By.xpath("/html/body/text()")).getText();
		//Assert.assertEquals(b, a);
		System.out.println(x);
		driver.close();
		
		driver.switchTo().window(tabsGUId.get(0));

	}
}
