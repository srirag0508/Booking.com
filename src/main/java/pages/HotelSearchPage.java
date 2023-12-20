package pages;

import org.openqa.selenium.By;
import stepdefinition.SharedSD;

import static stepdefinition.SharedSD.getDriver;

public class HotelSearchPage extends Base {

        // Display the total property in page
    By totalRating = By.xpath("//div[contains(@data-testid,'rating')] ");
    public int getTotalRating()
    {
        return getDriver().findElements(totalRating).size(); // like 25 i.e no of hotels or properties listed in page

    }




     // Display the total property rating for all the propertie in page

    By totalStars= By.xpath("//div[contains(@data-testid,'rating')]/span ");

    public int getTotalStars()   // like 125 stars for all property combined
    {
        return getDriver().findElements(totalStars).size(); // like 125 i.e 5 stars for all 125 properties

    }


    By hotels = By.xpath("//div[@data-testid='title']");


    public void clickStarRating(String stars)    {
        By rating = By.xpath("//div[@data-filters-group='class']//input[@name='class="+stars+"']");
        clickOn(String.valueOf(rating));


        }




   // To close the Sign in pop up if appears
    By popupClose = By.xpath("//button[contains@aria-label,'Dismiss')]");


    public void closePopup() {
        try {
            clickOn(String.valueOf(popupClose));

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    }

