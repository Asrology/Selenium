package extenreoport;

import java.io.ObjectInputFilter.Status;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

@Test

public class Samiple_extenreoport {
	
	public void extreport() {
		//@beforeasuite
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("target/Spark.html");
	extent.attachReporter(spark);
	ExtentTest test=extent.createTest("myfristtest");
	  test.pass("tc is pass");
	  test.fail("tc is fail");
	  test.info("tc is in progress");
	  test.skip("tc is skipped");
	  //@aftersuite
	  extent.flush();
	}
}
	