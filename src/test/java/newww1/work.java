package newww1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class work extends base {
	
	
public  WebDriver driver;
	
By button = By.id("startStopButton");

By slider = By.xpath("//div[@id='progressBar']/div[@role='progressbar']");

/*@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'One')]")
WebElement from;
@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'Five')]")
WebElement to;*/

	
	
   	@Test
    public void Testtt() {
    	browser();
    	ProgressBar(button, slider, "50%");
   
			
}
}