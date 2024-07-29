package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"./FeatureFiles/Employee.feature"},glue = {"empStepDefination"}, dryRun = false)
public class EmpRunner {


}
