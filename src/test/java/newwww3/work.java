package newwww3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class work extends base {
	
	
public  WebDriver driver;
	
By web1 = By.linkText("Click Here for Broken Link");



By txweb1 = By.xpath("//div[@id='content']//h3");

/*@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'One')]")
WebElement from;
@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'Five')]")
WebElement to;*/

	
	
   	@Test
    public void Testtt() {
    	browser();
    	ProgressBar(web1, txweb1, "Status Codes");
    	
    	}
}