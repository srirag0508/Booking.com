package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "Features" ,
        glue = {"StepDefinition","util"},
        plugin = {"pretty","html:target/cucumber-html-report","json:cucumber.json"})

public class TestRunner {


}