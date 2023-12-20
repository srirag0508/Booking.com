package stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HotelSearchPage;

import static stepdefinition.SharedSD.getDriver;

public class VerifyStarSD {

    HotelSearchPage ob = new HotelSearchPage();

    @Given("User is on the default section on page")
    public void user_is_on_the_default_section_on_page() {
        // its there in hook
        // verify title or url as confirmatory
        // Assert.assertEquals("This is not a search result page",
        //                "Booking.com : Hotels in Goa . Book your hotel now!",
        //                getDriver().getTitle());

        getDriver().navigate().refresh();
    }
   


    @When("^User select Star as (.+)$")
    public void userSelectStarAsStars(String stars) {

        ob.closePopup();  // to dismiss the pop up if it appears

        ob.clickOn(stars.split(" ")[0]);    // user click on 5-star properties . We need to get number 5 , hence spliting the property rating


    }

    @Then("^User verify that system displays only(.+) hotels$")
    public void userVerifyThatSystemDisplaysOnlyStarsHotels(String stars)
    {
        // rating will come as 3 Stars / 4 Stars, and we need to split and get the numeric value
        String starValueStr = stars.split("")[0];  // starValueStr will be 3 now
        int expectedStar = Integer.parseInt(starValueStr); // give me star value as 3

        int totalStar = ob.getTotalStars();
        int totalRating =ob.getTotalRating();

        int actual = totalStar / totalRating ;

        Assert.assertEquals("invalid Rating",expectedStar,actual);

    }
}
