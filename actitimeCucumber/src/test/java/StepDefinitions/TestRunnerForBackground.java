package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/BackgroundDemo.feature", glue = {"StepDefinitions"}, monochrome = true,
plugin = {"json:target/cucumber.json"})

public class TestRunnerForBackground {

}
