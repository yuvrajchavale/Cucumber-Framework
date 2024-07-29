package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = true, features =  {"./FeatureFiles/EmpCreationDeletion.feature"})
public class EmpCreteDelete {

	
}
