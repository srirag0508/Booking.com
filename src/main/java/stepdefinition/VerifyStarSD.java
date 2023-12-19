package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyStarSD {

    @Given ("User is on the default section on page")

    public void defualt_screen()
    {
    // its there in hook
        // verify title or url as confirmatory
    }


    @When("^User select Star as (.+)$")
    public void userSelectStarAsStars() {
        
    }

    @Then("^User verify that system displays only(.+) hotels$")
    public void userVerifyThatSystemDisplaysOnlyStarsHotels() {
    }
}
