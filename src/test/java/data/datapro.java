package data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.Assert;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;




public class datapro {

	
	 static WebDriver driver;
	 By Header=By.id("nickname");
	 
	// @BeforeTest
     public static WebDriver getWebDriver()
     {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\Drivers\\driv\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver.silentOutput", "true");
        driver = new ChromeDriver();
        driver.get("https://webapps.tekstac.com/AddressBook/");
        driver.manage().window().maximize();
        return driver;
     }
	
	//@Test(dataProvider="getData")
	    	// Apply the required annotation with its essential attributes for input parameters & preference of execution
	   	public  void setData(String nickName,String contactName,String company,String city,String country,String type, String jtdj
) throws Exception {
	   		// Method to locate the text fields NickName, ContactName, Company, City, Country & Type by id
	   		// Pass on input data by picking from data provider passed thru attributes
	   		driver.findElement(Header).sendKeys(nickName);
	   		driver.findElement(By.id("contact")).sendKeys(contactName);
	   		driver.findElement(By.id("company")).sendKeys(company);
	    		driver.findElement(By.id("city")).sendKeys(city);
	    		driver.findElement(By.id("country")).sendKeys(country);
	    		driver.findElement(By.id("type")).sendKeys(type);
	    		//driver.findElement(By.xpath("//button[@id='add']")).click();
	    	//System.out.println(jtdj);

	    		//JavascriptExecutor executor = (JavascriptExecutor) driver;
	    		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//button[@id='add']")));
	   	}
	
	/*@Test(dataProvider="getData")
  	public static void setData1(String nickName,String contactName,String company,String city,String country,String type) throws Exception {
  		setData( nickName, contactName,company,city,country,type);
  	}

	/*public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}
	
	public static Object[][] readExcel(String filePath, String sheetName) throws InvalidFormatException, IOException {
        FileInputStream file= new FileInputStream(filePath);
        XSSFWorkbook wb = new XSSFWorkbook(file);
        XSSFSheet sheet = wb.getSheet(sheetName);
        int rowCount = sheet.getLastRowNum();
        int column = sheet.getRow(0).getLastCellNum();
        Object[][] data = new Object[rowCount][column];
        for (int i = 1; i <= rowCount; i++) {
            XSSFRow row = sheet.getRow(i);
            for (int j = 0; j < column; j++) {
                XSSFCell cell = row.getCell(j);
                DataFormatter formatter = new DataFormatter();
                String val = formatter.formatCellValue(cell);
                data[i - 1][j] = val;
            }
        }

        return data;
    }
	@DataProvider(name="getData")
	public Object[][] loginData() throws InvalidFormatException, IOException {
		Object[][] arrayObject = readExcel("C:\\Users\\User\\workspacenew\\Dataprovider\\src\\test\\java\\testing\\test.xlsx","Sheet1");
		return arrayObject;
	}
    @AfterTest
 	//Apply the required annotation
 	public static void closeBrowser() { 
 		// Method to close the Browser
 		//driver.close();
 		
  	}*/
}
