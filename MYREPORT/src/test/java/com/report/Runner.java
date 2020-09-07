package com.report;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
/*@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
features = {".//feature/openGoogleBrowser.feature"},*/
@CucumberOptions(plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
features = {".//feature/HookandBackground.feature"},
dryRun = false,
monochrome = true)

public class Runner
{
	@BeforeClass
    public static void setup() {
        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath("cucumber-reports/"+timeStamp.replace(":","_").replace(".","_")+".html");
    }


    @AfterClass
   public static void writeExtentReport() {

    	Reporter.loadXMLConfig(new File("E:\\CucumberExtentReport\\MYREPORT\\src\\test\\java\\com\\report\\extent-config.xml"));
    	Reporter.setSystemInfo("User Name", "Gopinath Kumsi");
    	Reporter.setSystemInfo("Application Name", "MYREPORT ");
    	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
    	Reporter.setSystemInfo("Environment", "Home");
    	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    	Reporter.addScenarioLog("Scenario Log message goes here");
      }
    	
    		

      }
    

