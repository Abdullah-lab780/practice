package newwww2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class work extends base {
	
	
public  WebDriver driver;
	
By web1 = By.id("tabButton");
By web2 = By.id("windowButton");
By web3 = By.id("messageWindowButton");

By txweb1 = By.id("sampleHeading");
By txweb2 = By.id("sampleHeading");
By txweb3 = By.xpath("//body");

/*@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'One')]")
WebElement from;
@FindBy(xpath="//div[@id='demo-tabpane-list']//div[contains(text(),'Five')]")
WebElement to;*/

	
	
   	@Test
    public void Testtt() {
    	browser();
    	//ProgressBar(web1, txweb1, "This is a sample page");
    	//ProgressBar(web2, txweb2, "This is a sample page");
    	ProgressBar(web3, txweb3, "Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");	
}
}