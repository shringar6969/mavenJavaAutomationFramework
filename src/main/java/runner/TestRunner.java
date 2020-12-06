package runner;



import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
 features = "src/main/java/feature"
 ,glue={"stepDefinition"}
 ,plugin={"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html"}
 ,dryRun=false
 )






public class TestRunner {
	@AfterClass
	
    public static void writeExtentReport() {
		String reportPath = "src/main/java/resources/config-extent.xml";
        Reporter.loadXMLConfig(reportPath);
    }
}
