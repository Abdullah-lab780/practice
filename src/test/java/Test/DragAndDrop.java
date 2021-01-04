package Test;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;		

public class DragAndDrop {				

    WebDriver driver;			

    @BeforeTest		
    public void browser()					
    {		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\Drivers\\driv\\chromedriver.exe");					
         driver= new ChromeDriver();					
         driver.get("https://demoqa.com/sortable");					
    }
    @Test		
    public void drag()					
    {
    //Element which needs to drag.    		
        	WebElement From=driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[contains(text(),'One')]"));	
         
         //Element on which need to drop.		
         WebElement To=driver.findElement(By.xpath("//div[@id='demo-tabpane-list']//div[contains(text(),'Five')]"));					
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
			
}
}