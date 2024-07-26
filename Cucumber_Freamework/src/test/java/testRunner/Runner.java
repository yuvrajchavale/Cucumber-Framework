package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;




@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false,features = {"./FeatureFiles/login.feature"},
glue = {"D:\\Cucumber-Framework\\Cucumber_Freamework\\FeatureFiles\\login.feature"},
plugin= {"pretty","html:target/cucumber-reports"},monochrome = true)
public class Runner extends AbstractTestNGCucumberTests 
{
	
}
