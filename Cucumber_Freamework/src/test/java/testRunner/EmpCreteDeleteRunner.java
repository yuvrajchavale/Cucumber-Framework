package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features =  {"./FeatureFiles/EmpCreationDeletion.feature"},
                 glue = {"empDeletionCreation"},
                 plugin= {"pretty","html:target/cucumber-Delete Creation reports"})
public class EmpCreteDeleteRunner {
	
}
