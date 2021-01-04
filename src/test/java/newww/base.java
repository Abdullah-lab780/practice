package newww;
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
   	
    public void browser()					
    {		
         System.setProperty("webdriver.chrome.driver","C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\Drivers\\driv\\chromedriver.exe");					
         driver= new ChromeDriver();					
         driver.get("https://demoqa.com/sortable");					
    }
   		
    public void drag(By from, By to)					
    {
    //Element which needs to drag.    		
        WebElement From=driver.findElement(from);	
         
         //Element on which need to drop.		
        WebElement To=driver.findElement(to)	;			
         		
         //Using Action class for drag and drop.		
         Actions act=new Actions(driver);					

	//Dragged and dropped.		
         act.dragAndDrop(From, To).build().perform();		
			
}
}