																																																																																																																									package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Feature/signin.feature", glue = 
{"Stepdefinition" }, format = {"pretty", "html:target/cucumber" }, tags="@Smoke3")





public class DefaultRunner extends AbstractTestNGCucumberTests {

}
