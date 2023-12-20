package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePage;

import static stepdefinition.SharedSD.getDriver;

public class VerifyStarSD {

    HomePage ob = new HomePage();


    @Given ("User is on the default section on page")

    public void defualt_screen()
    {
    // its there in hook
        // verify title or url as confirmatory
        // Assert.assertEquals("This is not a search result page",
        //                "Booking.com : Hotels in Goa . Book your hotel now!",
        //                getDriver().getTitle());

        getDriver().navigate().refresh();
    }


    @When("^User select Star as (.+)$")
    public void userSelectStarAsStars(String stars) {

        ob.closePopup();  // to dismiss the sinin pop up if it appears

        ob.clickOn(stars.split(" ")[0]);    // user click on 5-star properties . We need to get number 5 , hence spliting the property rating


    }

    @Then("^User verify that system displays only(.+) hotels$")
    public void userVerifyThatSystemDisplaysOnlyStarsHotels(String stars) {
    }
}
