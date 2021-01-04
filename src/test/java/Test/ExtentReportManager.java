package Test;



import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager {
	
	//public static ExtentHtmlReporter htmlReporter;
	
	public static ExtentReports report;
	ExtentTest logger;
	public static ExtentReports getReportInstance(){
		
		if(report == null){
			/*
			 * Setting timeStamp for name
			 */
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());//time stamp
			String repName="Test-Report-"+timeStamp+".html";
			
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/" + repName);
			report =  new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Environemnt","QAE");
			report.setSystemInfo("Browser", "Chrome");
			report.setSystemInfo("Host name","Abdullah");
		
			

			htmlReporter.config().setDocumentTitle("Coursera Project"); // Title of report
			htmlReporter.config().setReportName("Functional Test Automation Report"); // name of the report
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP); //location of the chart
			htmlReporter.config().setTheme(Theme.DARK);
		}
		
		return report;
	}


}