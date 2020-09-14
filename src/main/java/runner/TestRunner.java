package runner;

import java.io.File;

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
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("/home/sumitjobprep/eclipse-workspace/mavenAutomation/src/main/java/resources/config-extent.xml"));
	//Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "Sumit Kumar");
	Reporter.setSystemInfo("Application Name", "Test App ");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}

}
