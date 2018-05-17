package Runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "src/test/resources/Feature/signup.feature", glue = 
{"Stepdefinition" }, format = {"pretty", "html:target/cucumber" }, tags="@Smoke4")

public class DefaultRunnerSignup {

}
