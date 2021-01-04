package Test;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import data.datapro;

import excel.excell;
import junit.framework.Assert;





public class Testt extends datapro {
	

	
	public static WebDriver driver;
	//public static Logger logger;
	ExtentReports report = ExtentReportManager.getReportInstance();
	ExtentTest logger;
	@BeforeTest
	public void setUp(){
		//logger = Logger.getLogger("ebanking");
		//PropertyConfigurator.configure("Log4j.properties");
		driver = getWebDriver();
	}
	//@Test(priority = 1, dataProvider = "...")
	@Test(priority = 1, dataProvider="getData")
  	public  void setData1(String nickName,String contactName,String abc, String company,String city,String country,String type, String jtdj) throws Exception {
		//logger.info("Passsword is provided");
		//ExtentReports report = ExtentReportManager.getReportInstance();
		logger = report.createTest("setData1");
		logger.log(Status.INFO, "Test Start");
		setData(nickName, contactName,company,nickName+company,country,type,jtdj);
		logger.log(Status.PASS, "test passed");
  	}
	
	@DataProvider(name="getData")
	public Object[][] loginData() throws InvalidFormatException, IOException {
		excell ex = new excell();
		Object[][] arrayObject = ex.readExcel("C:\\Users\\ABDULLAH\\Desktop\\Dataprovider\\src\\test\\java\\testing\\test.xlsx","Sheet1");
		return arrayObject;
	}
	@Test(priority = 2)
  	public  void set1() throws Exception {
		//logger.info("Passsword is provided");
		//ExtentReports report = ExtentReportManager.getReportInstance();
		
		logger = report.createTest("set1");
		logger.log(Status.PASS, "Test Start1");
		logger.log(Status.PASS, "Test Start1");
		Assert.assertEquals(5, 5);
		logger.log(Status.PASS, "Test finish1");
  	}
	//@Test(priority = 2)
  	public  void set2() throws Exception {
		//logger.info("Passsword is provided");
		//ExtentReports report = ExtentReportManager.getReportInstance();
		
  		logger = report.createTest("set2");
		logger.log(Status.PASS, "Test Start2");
		logger.log(Status.PASS, "Test Start2");
		Assert.assertEquals(5, 5);
		logger.log(Status.PASS, "Test finish2");
  	}
	//@Test(priority = 3)
  	public  void set3() throws Exception {
		//logger.info("Passsword is provided");
		//ExtentReports report = ExtentReportManager.getReportInstance();
		
  		logger = report.createTest("set3");
		logger.log(Status.PASS, "Test Start3");
		logger.log(Status.PASS, "Test Start3");
		Assert.assertEquals(5, 5);
		logger.log(Status.PASS, "Test finish3");
  	}
	
	@AfterMethod
	public void setTestResult(ITestResult result) throws IOException {

		

		if (result.getStatus() == ITestResult.FAILURE) {
			logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" "+"Failed",ExtentColor.RED));
			
		} else if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" "+"Successfully Passed",ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" "+"Skipped",ExtentColor.ORANGE));
		}
 
		report.flush();
		
	}

	
   // @AfterTest
 	
 	public void closeBrowser() { 
    	report.flush();
 		driver.quit();
 		
  	}

}
