package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//UserAuthentication.feature", glue = "stepDefinations", plugin= {"pretty","html:target/cucumber-reports"})
public class UserAuthTest extends AbstractTestNGCucumberTests{

	
}
