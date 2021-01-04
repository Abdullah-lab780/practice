package newww1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class base {

	public WebDriver driver;

	public WebElement to;

	public void browser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\Drivers\\driv\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/progress-bar");
	}

	public void ProgressBar(By Button, By Slider, String a) {
		// Element which needs to drag.
		WebElement clickButton = driver.findElement(Button);
		clickButton.click();

		// Element on which need to drop.
		WebElement slider = driver.findElement(Slider);
		int i = 1;
		while (i == 1) {
			String b = slider.getText();
			if (a.equals(b)) {
				clickButton.click();
				i++;
			}
		}

	}
}