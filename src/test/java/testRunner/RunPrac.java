package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Features2",
                  glue = {"driverFactory2","myHooks2","stepDefinition2"},
                  tags = "@Login or @smoke or @regression or @Prod or @All or @HW3 or @usingDataTable",
                  dryRun = false,
                  monochrome = true,
//                  plugin = {"pretty","html:target/cucumber-reports/projectreport.html"}
                  plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
            
		         )

public class RunPrac {
	

}
