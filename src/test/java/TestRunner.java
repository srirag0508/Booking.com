import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Features",
        glue = {"src/main/java/stepdefinition", "src/main/java/util"},
        plugin = {"pretty","html:target/report.html"})

public class TestRunner {


}